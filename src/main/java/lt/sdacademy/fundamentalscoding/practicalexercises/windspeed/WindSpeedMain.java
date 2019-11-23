package lt.sdacademy.fundamentalscoding.practicalexercises.windspeed;

import java.util.Scanner;

/*
1. Ivedamas vejo greitis km/h
2.Paverciamas vejo greitis is km/h->greitis mazgais
3.Vejo greiti Beuforto skaleje Math.pow(greitis, laipsnis) Beuforto skales formule=vejo greitis: 3.01^1.5
3.1. Beuforto skales matmuo negali buti didesnis nei 12, mums turi grazinti 12
4. Jei vejo greitis didesnis nei 20 km->stiprus
4. Atspausdinti rezultatus
 */
public class WindSpeedMain {
    static final double NAUTIC_MILE = 1.852;
    private static final double BEAUFORT_CONSTANT = 3.01;

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Iveskite vejo greiti");
        int windSpeedKilometersPerHour = inputScanner.nextInt();

       /*double greitis_mazgais = kmh * NAUTIC_MILE;
        System.out.println("Vejo greitis mazgais " + greitis_mazgais);
        System.out.println("Vejo greitis Beauforto skaleje: " + Math.pow(kmh/BEAUFORT_CONSTANT, 1.5));*/

        System.out.println("Vejo greitis mazgais " + kilometersPerHourToKnots(windSpeedKilometersPerHour));
        System.out.println("Vejo Beuforto skaleje " + kilometersPerHourToBeufortScale(windSpeedKilometersPerHour));
        System.out.println("Vejo stiprumas: " + getWindStrength(windSpeedKilometersPerHour));
        System.out.println();
    }

        /*if (kmh <= 20) {
            System.out.println("Silpnas");
        } else {
            System.out.println("Stiprus");
        }*/

        /*System.out.println("Vejo stiprumas: "+kmh);

                kmh<=20?"ramus":"stiprus";
                }
                }*/

    private static double kilometersPerHourToKnots(int windspeed) {
        return (NAUTIC_MILE * windspeed);
    }

    private static double kilometersPerHourToBeufortScale(int windSpeed) {
        double fort = Math.pow(BEAUFORT_CONSTANT, 1.5);
        return windSpeed / fort;
    }

    private static String getWindStrength(int windSpeed) {
        return windSpeed <= 20 ? "ramus" : "stiprus";
    }
}