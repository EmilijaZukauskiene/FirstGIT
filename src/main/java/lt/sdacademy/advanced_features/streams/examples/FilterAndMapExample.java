package lt.sdacademy.advanced_features.streams.examples;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class FilterAndMapExample {

    private static final Logger logger = Logger.getLogger(FilterAndMapExample.class);

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrew", "Brandon", "Michael");

        //Filter
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(name -> logger.info(name)); // forEach tik literuoja ir strukturos nekeicia
        // Map
        List<Integer> nameLengths = names.stream()
                .map(name -> name.length())
                .collect(Collectors.toList());
        logger.info(nameLengths);

        OptionalDouble averageNameLegthOptional = names.stream()
                .mapToInt(name -> name.length()) // mapinsim i sveika skaiciu pasirasom
                .map(number->(int) Math.pow(number,2))
                .average();
        logger.info(averageNameLegthOptional.orElse(0));
        //Use decimal format to round number
    }
}
