package lt.sdacademy.fundamentals.arrays;

import java.util.Arrays;
import java.util.List;

public class Example3 {

    public static void main(String[] args) {

        int[] array0fInts = {10, 15, 20, 25, 30};

        System.out.println((array0fInts[0])); //prints 10
        System.out.println((array0fInts[2])); //prints 20
        System.out.println((array0fInts[4])); //prints 30

        for (int i = 0; i < array0fInts.length; i++) {
            System.out.print(array0fInts[1] + ""); //kartos ta pacia masyvo eilute 5k.
        }
      System.out.println(); // Spausdinama tuscia eilute

        // isspausdins 10 15 20 25 30
        for (int i : array0fInts) {
            System.out.print(i + ""); // isspausdins visa masyva vienoje eiluteje
        }
      System.out.println();

      List<Integer> integerList = Arrays.asList(10, 15, 20, 25, 30);
        integerList.forEach(number -> System.out.print(number + ""));
    }
}