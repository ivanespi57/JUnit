
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void TestAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(10, calculator.add(5, 5));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    public void TestSubstract() {
        assertEquals(-1, calculator.subtract(2, 3));
        assertEquals(0, calculator.subtract(5, 5));
        assertEquals(12, calculator.subtract(24, 12));
        assertEquals(3, calculator.subtract(6, 3));
    }

    @Test
    public void TestMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(25, calculator.multiply(5, 5));
        assertEquals(288, calculator.multiply(24, 12));
        assertEquals(18, calculator.multiply(6, 3));
    }

    @Test
    public void TestDivide() {
        assertEquals(0.5, calculator.divide(2, 4)); 
        assertEquals(1.0, calculator.divide(5, 5));
        assertEquals(2.0, calculator.divide(24, 12));
        assertEquals(0.3, calculator.divide(6, 20));
    }

    
}
