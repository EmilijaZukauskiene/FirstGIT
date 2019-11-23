package lt.sdacademy.homeWork;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        int number;

        Scanner vartotojasScanner = new Scanner(System.in);

        System.out.println("Kokia siandien savaites diena?");
        number = vartotojasScanner.nextInt();


        switch (number) {
            case 1:
                System.out.println("Pirmadienis");
                break;
            case 2:
                System.out.println("Antradienis");
                break;
            case 3:
                System.out.println("Treciadienis");
                break;
            case 4:
                System.out.println("Ketvirtadienis");
                break;
            case 5:
                System.out.println("Penktadienis");
                break;
            case 6:
                System.out.println("Sestadienis");
                break;
            case 7:
                System.out.println("Sekmadienis");
                break;
            default:
                System.out.println("Tokios savaitės dienos nera");
        }
    }
}