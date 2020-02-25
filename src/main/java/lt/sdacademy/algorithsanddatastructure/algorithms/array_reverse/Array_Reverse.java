package lt.sdacademy.algorithsanddatastructure.algorithms.array_reverse;

import java.util.Arrays;
import java.util.Collections;

public class Array_Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 7, 1, 2};
        reverse(arr, arr.length);
    }

    static void reverse(int a[], int n) { // n- masyvo ilgis
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        System.out.print("Reversed array: ");
        for (int k = 0; k < n; k++) {
            System.out.print(b[k]);
        }
    }
}
