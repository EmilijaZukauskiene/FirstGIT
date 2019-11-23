package lt.sdacademy.homeWork2.dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DogMain {

    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            dogList.add(buildDog());
        }
        System.out.println("Vyriausio šuns vardas: " + findOldestDog(dogList));
        System.out.println("Vidutinis šunų amžius: " + findAverageYearOfDogs(dogList));
    }

    private static Dog buildDog() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Įveskite šuns vardą");
        String name = inputScanner.nextLine();
        System.out.println("Įveskite šuns spalvą");
        String color = inputScanner.nextLine();
        System.out.println("Įveskite šuns amžių");
        int age = inputScanner.nextInt();
        return new Dog(name, age, color);
    }

    private static String findOldestDog(List<Dog> dogList) {
       /*return dogList.stream()
                .max(Comparator.comparingInt(Dog::getAge))
                .get()
                .getName();*/
        String oldestDogName = dogList.get(0).getName();
        int oldestDog = dogList.get(0).getAge();
        for (Dog dog : dogList) {
            if (oldestDog < dog.getAge()) {
                oldestDog = dog.getAge();
                oldestDogName = dog.getName();
            }
        }
        return oldestDogName;
    }

    private static double findAverageYearOfDogs(List<Dog> dogList) {
        double averageYear = 0;
        for (Dog dog : dogList) {
            averageYear += dog.getAge();
        }
        return averageYear / dogList.size();
    }
}