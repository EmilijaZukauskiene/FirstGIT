package lt.sdacademy.advanced_features.collections;

import java.util.HashMap;
import java.util.Map;

public class Map_Example {
    public static void main(String[] args) { // MAP'e literuojamas PUT'as, GET'as
        Map<String, String> countries = new HashMap<>();
        countries.put("Poland", "Warsaw");
        countries.put("Germany", "Berlin");

        for (Map.Entry<String, String> dictionary : countries.entrySet()) {
            String country = dictionary.getKey(); // 1 reiksme "Poland"
            String capital = dictionary.getValue(); // 2 reiksme "Warsaw"
            System.out.printf("%s : %s\n", country, capital);
        }
    }
}
