package lt.sdacademy.advanced_features.lambdaexpresion.example1;

import java.text.SimpleDateFormat;
import java.util.function.Function;

public class FunctionInterfaceExample2 {

    public static void main(String[] args) {
        Function<String, Integer> stringLenght = s -> s.length(); //funkcija <> parodo kokiu parametru paims ir kokiu grazins , nurodo kiek simboliu sudaro Stringas, -> = return
        System.out.println(stringLenght.apply("ABCDE"));

        Function<String, String> repalceCommasWithDots = s -> s.replaceAll(",", ",");
        System.out.println(repalceCommasWithDots.apply("a,b,c"));
        System.out.println(replaceAll("a,b,c"));
    }
    private static String replaceAll (String word){
        return word.replaceAll(",", ",");
    }
}
