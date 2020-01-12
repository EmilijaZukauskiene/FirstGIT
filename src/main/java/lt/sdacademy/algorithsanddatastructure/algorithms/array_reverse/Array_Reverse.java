package lt.sdacademy.algorithsanddatastructure.algorithms.array_reverse;

import java.util.Arrays;
import java.util.Collections;

public class Array_Reverse {
    public static void main(String[] args) {
        Integer[] arr = {1, 4, 5, 6, 7, 1, 2};
        reverse(arr);
    }

    /*function reverses the elements of the array*/
    static void reverse(Integer a[]) {
        Collections.reverse(Arrays.asList(a));
        System.out.println("Reversed array is  " + Arrays.asList(a));
    }
}

