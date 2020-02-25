package lt.sdacademy.advanced_features.abstract_examples.shape;

import lt.sdacademy.fundamentals.circle.Circle;

import java.io.*;
import java.util.Scanner;

public class ShapesMain {

    private static final String OUTPUT_FILE_LOCATION = "/home/emilija/IdeaProjects/FirstGIT/src/main/java/lt/sdacademy/advanced_features/abstract_examples/shape/File.txt";

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite apskritimo spindulio ilgi");
        int radius = scanner.nextInt();

        System.out.println("Iveskite stataus trikampio krastines 'a' ilgi");
        double rarwWidth = scanner.nextDouble();

        System.out.println("Iveskite stataus trikampio krastines 'b' ilgi");
        double rarHeight = scanner.nextDouble();

        System.out.println("Iveskite staciakampio 'a' krastines ilgi");
        double rectLength = scanner.nextDouble();

        System.out.println("Iveskite staciakampio 'b' krastines ilgi");
        double rectHeight = scanner.nextDouble();

        Circle circle = new Circle(radius, "orange");
        double circleSquare = getCircleSquare(circle);
        double circleLength = getCircleLenght(circle);


        RightAngleRectangle rightAngleRectangle = new RightAngleRectangle(rarwWidth, rarHeight, "red");
        double rarSquare = getRarSquare(rightAngleRectangle);


        Rectangle rectangle = new Rectangle(rectLength, rectHeight, "green");
        double rectSquare = getRectSquare(rectangle);


        System.out.printf("Apskritimo plotas: %.2f ", circleSquare);
        System.out.printf("Apskritimo ilgis: %.2f ", circleLength);
        System.out.printf("Stataus trikampio plotas yra: %.2f ", rarSquare);
        System.out.printf("Staciakampio plotas yra:  %.2f", rectSquare);

        writeDataToFile(circleSquare, circleLength, rarSquare, rectSquare);

    }

    private static void writeDataToFile(double circleSquare, double circleLength, double rarSquare, double rectSquare) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_LOCATION))) {
            bw.write(String.format("Apskritimo plotas: %.2f ", circleSquare));
            bw.write(String.format("Apskritimo ilgis: %.2f ", circleLength));
            bw.write(String.format("Stataus trikampio plotas yra: %.2f ", rarSquare));
            bw.write(String.format("Staciakampio plotas yra:  %.2f", rectSquare));

        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas");
        } catch (IOException e) {
            System.out.println("Ivyko klaida rasant duomenis i faila!");
        }
    }

    private static double getCircleSquare(Circle circle) {
        return Math.pow(circle.getRadius(), 2) * Math.PI;
    }

    private static double getCircleLenght(Circle circle) {
        return Math.PI * circle.getRadius() * 2;
    }

    private static double getRarSquare(RightAngleRectangle rightAngleRectangle) {
        return rightAngleRectangle.height * rightAngleRectangle.width / 2;
    }

    private static double getRectSquare(Rectangle rectangle) {
        return rectangle.height * rectangle.width;
    }
}
