package lt.sdacademy.advanced_features.generics.exercise1;

import lt.sdacademy.advanced_features.inheritance.animals.Animal;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class); //LOGER

    public static void main(String[] args) {

        logger.error("Labas rytas!"); //LOGER

        StoreGenericValues values = new StoreGenericValues();

        values.storeValue("Tekstas");
        values.storeValue(123);
        values.storeValue(12.4);

        List item = values.getItems();

        for (Object items : item) {
            System.out.println("Items in list: " + item);

        }
    }
}

//Create a simple Generic class, that will give a possibility, to store any kind of value within.
// Add object of type String, Integer and Double to array of that Generic type.
// Print all values of the array within a loop.*/