package lt.sdacademy.advanced_features.lambdaexpresion.example4;

import java.util.function.UnaryOperator;

public class OperatorExample {

    public static void main(String[] args) {
        UnaryOperator<Integer> toSquareUnnaryOperator = i -> i * i;
        System.out.println(toSquareUnnaryOperator.apply(5));
    }
}
