package lt.sdacademy.homeWork;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        int x;
        int y;

        Scanner vartotojas = new Scanner(System.in);
        Scanner actionScanner = new Scanner(System.in);

        boolean calculate = true;
        while (calculate) {

            System.out.println("Iveskite x kordinates skaiciu");
            x = vartotojas.nextInt();

            System.out.println("Iveskite y kordinates skaiciu");
            y = vartotojas.nextInt();

            if (x > 0 && y > 0) {
                System.out.println("Taskas yra pirmame ketvirtyje");
            } else if (x > 0 && y < 0) {
                System.out.println("Taskas yra antrame ketvirtyje");
            } else if (x < 0 && y < 0) {
                System.out.println("Taskas yra treciame ketvirtyje");
            } else
                System.out.println("Taskas yra ketvirtame ketvirtyje");

            System.out.println("Ar norite vesti kordinates is naujo? TAIP : NE");
            String answer = actionScanner.nextLine();
            if (answer.equals("NE") || answer.toUpperCase().equals("NE")) {
                calculate = false;
            }
        }
    }
}
