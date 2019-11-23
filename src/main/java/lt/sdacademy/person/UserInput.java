package lt.sdacademy.person;

import java.util.Scanner;


public class UserInput {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Jusus vardas");
        String name = input.nextLine();

        System.out.println("Jusu amzius");
        int age = input.nextInt();

        System.out.println("Jusu ugis");
        double tall = input.nextDouble();

        System.out.println("Vardas: "+ name);
        System.out.println("Amzius: "+ age);
        System.out.println("Ugis: "+ tall);

        Person Emilija = new Person (name, age, tall) ;

    }
}
