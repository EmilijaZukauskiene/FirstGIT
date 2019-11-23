package lt.sdacademy.homeWork2.car.refactor;

import lt.sdacademy.homeWork2.car.Car;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarMainRefactored {

    private static final String FILE_LOCATION = "C:\\Users\\Emilija\\IdeaProjects\\FirstProject\\src\\main\\java\\lt\\sdacademy\\homeWork2\\car\\refactor\\CarData";

    public static void main(String[] args) {
        List<Car> carList = readFile();

        System.out.println("Naujausias automobilis: " + findNewestCar(carList));
        System.out.println("Vidutinis automobilių amžius: " + findAverageCarsYear(carList));
        System.out.println("Brangiausias automobilis: " + findMostExpensiveCar(carList));
    }

    private static List<Car> readFile() {
        List<Car> carList = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION));
            String line = br.readLine();

            while (line != null) {
                carList.add(mapDataToModel(line));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("KLAIDA!");
        }

        return carList;
    }

    private static Car mapDataToModel(String lineData) {
        String[] splitedData = lineData.split(",");
        return new Car(splitedData[0],
        Integer.parseInt(splitedData[1]), Integer.parseInt(splitedData[2]), Integer.parseInt(splitedData[3]), splitedData[4]);
    }

    private static String findNewestCar(List<Car> carList) {
        /*return carList.stream()
                .max(Comparator.comparingInt(Car::getYear))
                .get()
                .toString();*/
        int newestCarMadeIn = carList.get(0).getYear();
        for (Car car : carList) {
            newestCarMadeIn = Math.max(newestCarMadeIn, car.getYear());
        }
        return String.valueOf(newestCarMadeIn);
    }

    private static double findAverageCarsYear(List<Car> carList) {
        int carsYearSum = 0;
        for (Car car : carList) {
            carsYearSum += car.getYear();
        }
        return (double) carsYearSum / carList.size();
    }

    private static double findMostExpensiveCar(List<Car> carList) {
        /*return carList.stream()
                .max(Comparator.comparingDouble(Car::getPrice))
                .get()
                .toString();*/
        double mostExpensiveCar = carList.get(0).getPrice();
        for (Car car : carList) {
            mostExpensiveCar = Math.max(mostExpensiveCar, car.getPrice());
        }
        return mostExpensiveCar;
    }
}

