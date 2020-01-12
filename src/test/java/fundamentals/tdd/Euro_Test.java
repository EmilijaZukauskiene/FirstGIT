/*package fundamentals.tdd;

import lt.sdacademy.fundamentals_Testing.tdd.Euro1;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Euro_Test {

@Test
public void getAmountInText() {
        Assert.assertEquals("EUR 2.00", new Euro1(2).toString());
        }
@Test
public void testEquality() {
        assertTrue(new Euro1(2).equal(new Euro1(2)));
        assertFalse(new Euro1(17).equal(new Euro1(267)));
        }
@Test
public void testSubtraction() {
        Euro1 euro=new Euro1 (10);
        assertEquals(4, euro.subtract(6));
        }
//   @Test
public void testDivision() {
        assertEquals(9,new Euro1(18).divide(new Euro1(2)));
        }

    @Test
    public void testMultiplication() {
        Euro1 euro1 = new Euro1(10);
        assertEquals(20, euro1.multiply(2));
    }
}
*/