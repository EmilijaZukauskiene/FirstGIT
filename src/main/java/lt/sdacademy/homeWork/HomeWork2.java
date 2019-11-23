package lt.sdacademy.homeWork;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        Scanner vartotojoSkaicius = new Scanner(System.in);
        Scanner actionScanner = new Scanner(System.in);
        int number = vartotojoSkaicius.nextInt();

        int daliklis1 = 2;
        int daliklis2 = 3;
        int daliklis3 = 5;
        int daliklis4 = 7;
        int remainder1 = number % daliklis1;
        int remainder2 = number % daliklis2;
        int remainder3 = number % daliklis3;
        int remainder4 = number % daliklis4;


        boolean calculate = true;
        while (calculate) {

            System.out.println("Prasome ivesti skaiciu");
            number = vartotojoSkaicius.nextInt();

            if (number == 2 || number == 3 || number == 5 || number == 7) {
                System.out.println("Skaicius pirminis");
            } else if (number == 0 || number == 1) {
                System.out.println("Skaicius nei pirminis nei sudetinis");
            } else if (remainder1 == 0 || remainder2 == 0 || remainder3 == 0 || remainder4 == 0) {
                System.out.println("Jusu pasirinktas skaicius yra lyginis");
            } else if (remainder1 > 0 || remainder2 > 0 || remainder3 > 0 || remainder4 > 0)
                System.out.println("Jusu pasirinktas skaicius yra pirminis");


            System.out.println("Ar norite ivesti skaiciu dar? TAIP : NE");
            String answer = actionScanner.nextLine();
            if (answer.equals("NE") || answer.toUpperCase().equals("NE")) {
                calculate = false;
            }
        }
    }
}
