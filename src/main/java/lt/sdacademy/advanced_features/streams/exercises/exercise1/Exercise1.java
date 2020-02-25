package lt.sdacademy.advanced_features.streams.exercises.exercise1;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercise1 {

    private static final Logger logger = Logger.getLogger(Exercise1.class);

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Romualdas", "Agne", "Elena", "Angele", "Laurynas", "Karolis", "Bronius", "Igne", "Meda");

        String name1 = names.stream()
                .filter(name -> name.length() < 6)
                .filter(name -> name.contains("e"))
                .peek(n -> System.out.println(n.toUpperCase()))
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .get();
        System.out.println(name1.toUpperCase());
    }
}

 /*Su esamu vardų sąrašu atlikite užduotis:
        Palikite tuos, kurie trumpesni, nei 6 simbolių;+
        Palikite tuos, kurie savyje turi raidę e;+
        Atspausdinti esamus vardus didžiosiomis raidėmis;+
        Jei yra keli variantai, surūšiuokite sąrašą abėcėlės tvarka ir pasirinkite paskutinį. [Romualdas, Agnė, Elena, Angelė, Laurynas, Karolis, Bronius, Ignė, Meda]*/