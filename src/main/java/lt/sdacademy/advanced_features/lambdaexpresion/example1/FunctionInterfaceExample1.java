package lt.sdacademy.advanced_features.lambdaexpresion.example1;

import java.util.function.Predicate;

public class FunctionInterfaceExample1 {

    public static void main(String[] args) {

        Runnable myRunnable = () -> System.out.println("Running a runnable"); // run metoda implementuojam po rodyklytes
        myRunnable.run();

        Predicate<String> startsWithABCTest = s -> s.startsWith("ABC"); // tikrina ar ABCDEF = prasideda ABC
        System.out.println(startsWithABCTest.test("ABCDEF"));

    }
}
