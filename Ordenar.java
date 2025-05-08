import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class Ordenar {
    
    public int[] sort(int[] array){
        Arrays.sort(array);
        return array;
    }

    @Test
    public void TestOrdenado(){
        assertArrayEquals(new int[] {1,2,3,4,5}, sort(new int[] {5,4,3,2,1}));
    }
}
