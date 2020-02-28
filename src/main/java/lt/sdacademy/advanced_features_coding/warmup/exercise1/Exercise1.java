package lt.sdacademy.advanced_features_coding.warmup.exercise1;


import com.google.gson.Gson;
import org.apache.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Exercise1 {

    private static final Logger logger = Logger.getLogger(Exercise1.class);
    private static final String INPUT_FILE_LOCATION = "/home/emilija/IdeaProjects/FirstGIT/src/main/java/lt/sdacademy/advanced_features_coding/warmup/exercise1/dataDrinks.json";

    public static void main(String[] args) {

        Gson gson = new Gson();

        List<String> drinks = Arrays.asList("arbat", "kavos", "pieno", "limonado", "alaus");

        List<String> drink = new ArrayList<>(drinks
                .stream()
                .filter(d -> d.startsWith("a"))
                .filter(d -> d.length() == 5)
                .collect(Collectors.toList()));

        for (String d : drink) {
            System.out.println(d);
        }
        String dr = gson.toJson(drink);

        try (FileWriter writer = new FileWriter(INPUT_FILE_LOCATION)) {
            gson.toJson(drink, writer);
            logger.info("Information was succesfully wrote into file.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}


/*
1. Duotą tekstino formato sąrašą reikia pakeisti, tokiu, kuris atitiktų sąlygas:
        Visi žodžiai prasidėtų iš mažosios a raidės;
        Žodis turi tik 5 raides;
        Atsakymą įrašyti į Json failą.*/
