import org.junit.Test;
import static org.junit.Assert.*;

public class Suma {
    public int suma(int a, int b) {
        return a + b;
    }
    
    @Test
    public void TestSuma() {
        assertEquals(5, suma(2, 3));
        assertEquals(10, suma(5, 5));
        assertEquals(0, suma(0, 0));
        assertEquals(-5, suma(-2, -3));
    }
}