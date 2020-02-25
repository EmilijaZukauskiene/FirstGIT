package lt.sdacademy.advanced_features.lambdaexpresion.example5;

import java.util.function.UnaryOperator;

public class BlockOfCodeExample {

    public static void main(String[] args) {

        UnaryOperator<Integer> toSquareOperator = i -> { // Integer parodome koki parametra jis priims
            int result = i * i;
            System.out.println("Result: " + result);
            return result;
        };
        toSquareOperator.apply(4);
    }
}
