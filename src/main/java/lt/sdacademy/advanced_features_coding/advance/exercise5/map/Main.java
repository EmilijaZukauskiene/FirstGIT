package lt.sdacademy.advanced_features_coding.advance.exercise5.map;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final String LOCAL_FILE = "/home/emilija/IdeaProjects/FirstGIT/src/main/java/lt/sdacademy/advanced_features_coding/advance/exercise5/map/VocationPlans.json";

    public static void main(String[] args) {

        Gson gson = new Gson();

        System.out.println("Iveskite keliones marsruta");

        Scanner scanner = new Scanner(System.in);
        String travelData = scanner.nextLine();



        Map<String, String> destinations = new HashMap<>();

    }
}

/*
5. We're planning vacations
        User provides information about the country and cities that he is going to visit. You can use a nested while loop to gather information and a HashMap to store it.
        Display the created plan.
        If city occurs on the list twice it should be displayed as "back and forth"
        Store created plan using JSON.*/
