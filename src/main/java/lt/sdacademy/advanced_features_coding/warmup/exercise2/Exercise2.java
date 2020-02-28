package lt.sdacademy.advanced_features_coding.warmup.exercise2;


import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Exercise2 {

    private static final Logger logger = Logger.getLogger(Exercise2.class);

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(getString(integerList));
    }

    private static String getString(List<Integer> integerList) {
        return integerList.stream()
                .map(i -> i % 2 == 0 ? "e" + i : "o" + i)
                .collect(Collectors.joining(", "));
    }
}

/*
2. Duotam sveikų skaičių formato sąrašui atlikti:
        Jei skaičius yra lyginis, tai prieš skaičių parašyti raidę e;
        Jei skaičius yra nelyginis, tai prieš skaičių parašyti raidę o;
        Skaičiai turi būti tarpusavyje atskirti kableliu;
        Pavyzdžiui: (3,44) -> o3,e44.*/
