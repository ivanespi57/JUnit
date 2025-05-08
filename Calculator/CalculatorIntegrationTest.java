
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorIntegrationTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAddAndSubstract(){
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.subtract(5, 5));
    }
    @Test
    public void testAddWithZero(){
        assertEquals(5, calculator.add(2, 3));
        
    }
    @Test
    public void testSubstractWithZero(){
        assertEquals(0, calculator.subtract(5, 5));
        
    }
    @Test
    public void testMultiplyAndDivide(){
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.subtract(5, 5));
    }
    @Test
    public void testMultiplyWithZero(){
        assertEquals(6, calculator.multiply(2, 3));

    }
    @Test
    public void testDivideWithZero(){
        assertEquals(0.5, calculator.divide(2, 4));

    }

}
