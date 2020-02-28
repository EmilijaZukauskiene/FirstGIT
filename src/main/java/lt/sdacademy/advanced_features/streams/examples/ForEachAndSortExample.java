package lt.sdacademy.advanced_features.streams.examples;

import lt.sdacademy.advanced_features.lambdaexpresion.example2.Person;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class ForEachAndSortExample {

    private static final Logger logger = Logger.getLogger(ForEachAndSortExample.class);

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Michael", "Andrew", "Brandon");
        names.stream()
                .sorted() // isrusiuoja abeceles tvarka
                .forEach(logger::info);// ekvivalentu system.out.println

        List<Person> people = Arrays.asList(
                new Person("John", "Smith", 20),
                new Person("Sarah", "Conor", 30)
        );


        people.stream()
                .sorted((p1, p2) -> p1.getSurname().compareTo(p2.getSurname())) // nebutina skliausteliuose rasyti jei lyginam vieno tipo elementus. Isrusiuoja abeceles tvarka. p1 - pirmas elementas, p2- antras elementas
                .forEach(person -> logger.info(person.getSurname()));
    }
}
