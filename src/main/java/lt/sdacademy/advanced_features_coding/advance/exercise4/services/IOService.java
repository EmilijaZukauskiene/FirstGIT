package lt.sdacademy.advanced_features_coding.advance.exercise4.services;

import lt.sdacademy.advanced_features_coding.advance.exercise4.model.Bike;
import lt.sdacademy.advanced_features_coding.advance.exercise4.model.Car;
import lt.sdacademy.advanced_features_coding.advance.exercise4.model.Person;

import java.util.Scanner;

public class IOService {

    public static String inputData(String messageToUser) {

        Scanner scanPersonsData = new Scanner(System.in);
        System.out.print(messageToUser);

        String personsData = scanPersonsData.nextLine();
        return personsData;
    }
    public static void outputData(String personsData) {
        Car car = new Car();
        Bike bike = new Bike();
        Parser parser = new Parser();

        Person personAdded = parser.personDataFromFile(personsData);
        System.out.println(personAdded.getbName() + " " + personAdded.getBornDate() );
        bike.printing(personAdded);
        car.printing(personAdded);
    }
}
