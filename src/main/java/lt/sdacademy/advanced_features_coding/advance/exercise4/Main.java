package lt.sdacademy.advanced_features_coding.advance.exercise4;

import lt.sdacademy.advanced_features_coding.advance.exercise4.model.Bike;
import lt.sdacademy.advanced_features_coding.advance.exercise4.model.Car;
import lt.sdacademy.advanced_features_coding.advance.exercise4.services.IOService;


public class Main {

    public static void main(String[] args) {

        IOService ioService = new IOService();

        String personsData = ioService.inputData("Please enter persons information like (John Smith born 1984-03-24) : ");
        ioService.outputData(personsData);
    }
}


/*
4. Let's buy a vehicle
        Create class Person
Create class Parser
Create interface or an abstract class Vehicle
Create classes Car and Bike, that will implement/inherit Vehicle.
        User will provide all of the details about the Person (buyer) using command-line (e.g. "John Smith born 1984-03-24". Provided information will be parsed using Regex within Parser class. Parser class should receive char sequence and return an object of type Person or Null if provided details will not have required information.
        Created person will then buy a bike and car. Information about what and when was bought should be displayed.
*/
