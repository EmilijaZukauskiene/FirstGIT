package lt.sdacademy.advanced_features.generics.exercise2;

import java.util.Arrays;
import java.util.List;

public class LastValueMain {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("a", "B", "C", "d");
        List<Integer> integers = Arrays.asList(2, 999, 12, -22);

        System.out.println(GenericMethodMain.lastEntry(strings));
        System.out.println(GenericMethodMain.lastEntry(integers));
    }
}


   /* Susikurti klasę, kuri turi vieną Generic statinį metodą, kurio pagalba
        yra gražinama paskutinė, į ją paduoto sąrašo reikšmė.
        Išmėginti tiek su String tipo, tiek su Integer tipo sąrašais. */