package fundamentals.basics;

import lt.sdacademy.fundamentals_Testing.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Example2 {

    @Test
    public void test() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = (int) calculator.add(5, 3);
        //then
  //      assert result == 8;
        assertEquals(result, 8);
    }
    @Test
    public void testDivision() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.divide(8, 2);

        //then
        assertEquals(result, 4);
    }
    @Test
    public void testSubstraction(){
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.subtract(8, 2);
        //then
        assertEquals(result, 6);
    }
}
