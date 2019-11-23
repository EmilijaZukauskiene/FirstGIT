package lt.sdacademy.homeWork2.dog.refactored;


import lt.sdacademy.homeWork2.dog.Dog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DogMainRefactored {
    private static final String FILE_LOCATION = "C:\\Users\\Emilija\\IdeaProjects\\FirstProject\\src\\lt\\sdacademy\\homeWork2\\Dog\\refactored\\DogsData.txt";

    public static void main(String[] args) {
        List<Dog> dogList = getDogsFromFile();

        System.out.println("Vyriausio šuns vardas: " + findOldestDog(dogList));
        System.out.println("Vidutinis šunų amžius: " + findAverageYearOfDogs(dogList));
    }

    private static List<Dog> getDogsFromFile() { // nusiskaitom duomenis is failo
        List<Dog> dogList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))) {
            // String line = "";
            String line = br.readLine();

            while (line != null) {
                // line = br.readLine();
                String[] splitedLine = line.split(",");
                dogList.add((mapDataToObject(splitedLine)));
                if (line == null) {
                    break;
                }
                dogList.add(mapDataToObject(line.split(",")));
            }
        } catch (IOException e) {
            System.out.println("KLAIDA");
        }
        return dogList;
    }

    private static Dog mapDataToObject(String[] dogsData) {
        return new Dog(dogsData[0], Integer.parseInt(dogsData[1]), dogsData[2]); // parseInt - vercia teksta i skaiciu
    }

    private static String findOldestDog(List<Dog> dogList) {
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

    private static double findAverageYearOfDogs(List<Dog> dogList) { //parametras
        double averageYear = 0;
        for (Dog dog : dogList) {
            averageYear += dog.getAge();
        }
        return averageYear / dogList.size();
    }
}