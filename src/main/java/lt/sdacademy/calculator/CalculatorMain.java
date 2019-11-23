package lt.sdacademy.calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {

        Scanner actionScanner = new Scanner(System.in);

        boolean calculateOn = true;
        double result = 0;

        while (calculateOn) {

            // System.out.println("Ivesk pirma skaiciu");
            //   double firstNum = numberScanner.nextDouble();

            double firstNum = getNum("Iveskite pirma skaiciu");
            double secondNum = getNum("Iveskite pirma skaiciu");
/*
            System.out.println("Ivesk antra skaiciu");
            double secondNum = numberScanner.nextDouble();*/


            System.out.println("Koki veiksma norite atlikti: + - / *");
            String action = actionScanner.nextLine();

            result = getResult(action, firstNum, secondNum); // funkcija!

            System.out.println("Gautas rezultatas: " + result);

            System.out.println("Jei norite skaiciuoti dar karta iveskite: TAIP, kitu atveju NE");
            String userAnswerOnCalculation = actionScanner.nextLine();

            if (userAnswerOnCalculation.equalsIgnoreCase("NE")) {
                calculateOn = false;
            }


        /*if (action.equals("+")) {
            System.out.println(firstNum + secondNum);}
        if (action.equals("-")) {
                System.out.println(firstNum - secondNum);}
        else if (action.equals("/")) {
        else
            System.out.println("Nezinomas veiksmas");*/


      /*  System.out.println("Ar norite skaiciuoti toliau? TAIP : NE");
        String answer = actionScanner.nextLine();
        if (answer.equals("NE") || answer.toUpperCase().

                equals("NE")) {
            calculate = false;
        }*/

        }
    }

    private static double getResult(String action, double num1, double num2) {
        switch (action) {
            case ("+"): {
                return num1 + num2;
            }
            case ("-"): {
                return num1 - num2;
            }
            case ("*"): {
                return num1 * num2;
            }
            case ("/"): {
                return num1 / num2;
            }
            default: {
                System.out.println("Veiksmas nerastas");
                return 0;
            }
        }
    }

    private static double getNum(String message) {
        Scanner numberScanner = new Scanner(System.in);
        System.out.println(message);
        double number = numberScanner.nextDouble();
        return number;
    }
}
