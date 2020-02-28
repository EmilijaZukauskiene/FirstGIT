package lt.sdacademy.advanced_features.annotations.supresswarnings;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        addWordIntoList(Arrays.asList());
    }
    // Compile class to see warning
     @SuppressWarnings("Unchecked")

    private static void addWordIntoList(List inputList) {
        List<String> list = (List<String>) inputList;
     }
}
