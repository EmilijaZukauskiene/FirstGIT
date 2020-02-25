package lt.sdacademy.advanced_features.streams.exercises.exercise3;

import org.apache.log4j.Logger;

import java.util.Random;

public class Exercise3 {
    private static final Logger logger = Logger.getLogger(Exercise3.class);

    public static void main(String[] args) {

        int number = new Random().ints(100,0,2).sum();
        System.out.println(Math.sqrt(number));
    }
}
/*
 Skaičiai:
         Prieš atliekant užduotis susigeneruokite ilgą atsitiktinių skaičių masyvą, sudarytą tik iš 0 ir 1;
         Apskaičiuokite viso masyvo skaitmenų sumą ir ištraukite šaknį.*/
