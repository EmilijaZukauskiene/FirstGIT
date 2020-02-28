package lt.sdacademy.advanced_features.streams.examples;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {

    private static final Logger logger = Logger.getLogger(ReduceExample.class);

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "Michael");

        String namesConcatention = names.stream()
                .filter(name-> !names.isEmpty())
                .reduce("",
                        (currentValue, element) -> (currentValue.isEmpty() ? "" : currentValue + ", ") + element); // cuuraValue = Tom ir t.t. (literacijos metu literuojamas rezultatas)
        logger.info(namesConcatention);

        int num = names.stream()
                .map(String::length)
               // .limit(2)
                .reduce(0,
                        (sum, currentNum) -> (currentNum > 3 ? 1 : 0) + sum);
      /*  int result = 0;
        if (0>3){
            result=1;
        } else {*/

        logger.info(num);
    }
}
