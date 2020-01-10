/*package fundamentals.fridge;

import lt.sdacademy.fundamentals_Testing.fridge.Fridge;
import lt.sdacademy.fundamentals_Testing.fridge.NoSuchltemExeption;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Food_Testing {
    @Test
    public void testFridge() {
        //given
        Fridge fridge = new Fridge();
        //when
        fridge.put("cheese");
        //then
        assertEquals(true, fridge.contains("cheese"));
        assertEquals(false, fridge.put("cheese"));
        assertEquals(true, fridge.contains("cheese"));
        assertEquals(false, fridge.contains("ham"));
        fridge.put("ham");
        assertEquals(true, fridge.contains("cheese"));
        assertEquals(true, fridge.contains("ham"));
        try {
            fridge.take("sausage");
            Assert.fail("There was no sausage in the frige!");
        } catch (NoSuchItemException | NoSuchltemExeption e) {
            // ok
        }
    }
    @Test
    public void testPutTake() throws NoSuchItemException {
    }
    @Test
    public void testFridgeSize() {
        //give
        Fridge fridge =new Fridge();
        fridge.put("chese");
        fridge.put("chese");
        fridge.put("chese");
        //when
        int result = fridge.getFridgeSize();
        //then
        Assert.assertEquals(3,result);
    }
}
*/