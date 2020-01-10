package fundamentals.basics;

import lt.sdacademy.fundamentals_Testing.calculator.Calculator;
import org.junit.Test;

import java.util.Random;

public class Example4 {
    @Test (expected = ArithmeticException.class)
    public void shouldThrowExwptionWhenDivingBy0() {
        //given
        Calculator calculator = new Calculator();
        int number = new Random().nextInt();

        //when
        calculator.divide(number, 0);

        //then
        //should throw exeption
    }
}
