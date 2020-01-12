package fundamentals.basics;

import org.junit.Test;

import static org.junit.Assert.*;

public class Example3 {
    @Test
    public void testAssertEquals() {
        //given
        int firstNum = 2;
        int secondNum = 32;

        //when
        int result = firstNum * secondNum;

        //then
        assertEquals(64, 2 * 32);
        assertNotEquals("Values are not equal", 1, 2);
    }

    @Test
    public void testAssertTrueFalse() {
        //given

        //when

        //ethen
        assertTrue(3 == 3);
        assertFalse("Hello".equals("Not Hello"));
    }

    @Test
    public void testArrayEquals() {
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {1, 2, 3};
        assertArrayEquals(firstArray, secondArray);
    }

    @Test
    public void testAssertNull() {
        String s = null;
        assertNull(s);
    }

    @Test
    public void testAssertSame() {
        String s1 = "abf";
        String s2 = "abc";
        assertNotSame(s1, s2);
    }
}
