package lt.sdacademy.advanced_features.streams.examples;


import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class MatchExample {

    private static final Logger logger = Logger.getLogger(MatchExample.class);

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "Michael");

        boolean allNamesLengthIsGtThan3 = names.stream() //ima po viena elementa is musu masyvo ir tikrina salyga ar ilgis ilgesnis nei 3
                .allMatch(name -> name.length() > 3);
        logger.info(allNamesLengthIsGtThan3);

        boolean thereIsNameWhichLengthIsGtThan3 = names.stream() // tikrina visus elementus
                .anyMatch(name -> name.length() > 3);
        logger.info(thereIsNameWhichLengthIsGtThan3);
    }
}
