import org.junit.Test;
import static org.junit.Assert.*;

public class TestAssertions {
   // test data
   String str1 = new String ("abc");
   String str2 = new String ("abc");
   String str3 = null;
   String str4 = "abc";
   String str5 = "abc";
   
   int val1 = 5;
   int val2 = 6;

   String[] expectedArray = {"one", "two", "three"};
   String[] resultArray =  {"one", "two", "three"};

   @Test
   public void testThaTwoObjectsAreEqual() {
      // Check that two objects are equal
      assertEquals(str1, str2);
   }

   @Test
   public void testThatAConditionIsTrue() {
      // Check that a condition is true
      assertTrue (val1 < val2);
   }

   @Test
   public void tesTthatAConditionIsFalse() {
      // Check that a condition is false
      assertFalse(val1 > val2);
   }

   @Test
   public void testThatAnObjectIsntNull() {
      // Check that an object isn't null
      assertNotNull(str1);
   }

   @Test
   public void testThatAnObjectIsNull() {
      // Check that an object is null
      assertNull(str3);
   }

   @Test
   public void testIfTwoObjectReferencesPointToTheSameObject() {
      // Check if two object references point to the same object
      assertSame(str4,str5);
   }

   @Test
   public void testIfTwoObjectReferencesNotPointToTheSameObject() {
      // Check if two object references not point to the same object
      assertNotSame(str1,str3);
   }

   @Test
   public void testWhetherTwoArraysAreEqualToEachOther() {
      // Check whether two arrays are equal to each other.
      assertArrayEquals(expectedArray, resultArray);
   }
}