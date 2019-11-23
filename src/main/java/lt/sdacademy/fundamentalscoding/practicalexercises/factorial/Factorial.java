package lt.sdacademy.fundamentalscoding.practicalexercises.factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        int result = 1;

        System.out.println("Iveskite skaiciu");
        int input = inputScanner.nextInt();

        for (int i = 1; i <= input; i++) {
            result *= 1;
        }
        System.out.println(result);
    }
}
