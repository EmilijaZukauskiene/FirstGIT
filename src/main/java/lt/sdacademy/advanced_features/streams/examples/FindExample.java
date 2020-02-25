package lt.sdacademy.advanced_features.streams.examples;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindExample {

    private static final Logger logger = Logger.getLogger(FindExample.class);

    public static void main(String[] args) {
        List<String>names= Arrays.asList("Andrew", "Brandon", "Michael");

        List<String> namesCopy1 = new ArrayList<>(names); // (names) - konstruktorius
        List<String> namesCopy2 = new ArrayList<>(names
                .stream()
                .collect(Collectors.toList()) // pasakom, kad desim i lista
        );


//Why it won't work this way?
        //String firstName = names.stream().findFirst();

        Optional<String> firstName = names.stream().findAny();
        logger.info(String.format("First name: %s", firstName.orElse("list was empty")));
    }
}
