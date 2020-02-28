package lt.sdacademy.advanced_features.streams.exercises.exercise2;


import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class Exercise2 {

    private static final Logger logger = Logger.getLogger(Exercise2.class);

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Rytas", "Lova", "Durys", "Automobilis", "Katinas");

        String oneWord = names.stream()
                .reduce("",
                        (currentValue, element) -> currentValue + element);
        logger.info(oneWord);

        String oneWord1=names.stream()
                .map(String::toUpperCase)
                    .reduce("",
                            (currentValue, element) -> currentValue + element);
        logger.info(oneWord1);

        String oneWord2 = names.stream()
                .reduce("",
                        (currentValue, element) -> (currentValue.isEmpty() ? "" : currentValue + ",") + element);
        logger.info(oneWord2);
    }
}
/*
    Su esamu žodžių sąrašu atlikite užduotis:
        Sujunkite žodžius į vieną naudodami reduce funkciją;
        Naudodami pradinį žodžių sąrašą, paverskite juos didžiosiomis raidėmis su map funkcija ir vėl sujunkite į vieną žodį su reduce;
        Naudodami pradinį žodžių sąrašą, sujunkite į vientisą tekstą, kiekvieną žodį atskyrę ženklu , (tekstas negali prasidėti ar baigtis nurodytu ženklu);
        Naudodami pradinį žodžių sąrašą, išspausdinkite tuos, kurie turi raidę o. [Rytas, Lova, Durys, Automobilis, Katinas*/