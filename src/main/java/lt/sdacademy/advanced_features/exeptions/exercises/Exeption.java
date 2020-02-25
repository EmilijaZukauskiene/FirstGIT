package lt.sdacademy.advanced_features.exeptions.exercises;

import java.util.Scanner;

public class Exeption {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        String text = scanner.nextLine();


        try {
            int number = Integer.parseInt(text);
            System.out.println(number);

        } catch (Exception e) {
            try {
                double number = Double.parseDouble(text);
                System.out.println(number);

            } catch (NumberFormatException ex) {
                System.out.println("Klaidingai ivestas skaicius");
            }
        }
    }
}