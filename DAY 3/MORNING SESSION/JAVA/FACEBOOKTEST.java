import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions*;
public class FacebookTest{
    @Test
    public void TestThatFacebookExists(){
        String[] array = {"Peter"};
        Facebook.nameDisplayTest(array);
        
    }
    @Test
    public void TestThatEmptyArrayReturns(){
        String[] array = {};
        String expected = "no one likes this";
        String actual = Facebook.nameDisplayTest(array);
        assertEquals(actual, expected);
    }
    @Test
    public void TestThatElementsReturns(){
        String[] array = {"Peter"};
        String expected = "Peter likes this";
        String actual = Facebook.nameDisplayTest(array);
        assertEquals(actual, expected);
    }   
    @Test
    public void TestThatTwoElementsReturns(){
        String[] array = {"Jacob", "Alex"};
        String expected = "Jacob and Alex likes this";
        String actual = Facebook.nameDisplayTest(array);
        assertEquals(actual, expected);
    }   
    @Test
    public void TestThatThreeElementsReturns(){
        String[] array = {"Max", "John", "Mark"};
        String expected = "Max, John and Mark likes this";
        String actual = Facebook.nameDisplayTest(array);
        assertEquals(actual, expected);
    } 
       @Test
    public void TestThatMoreThanThreeElementsReturns(){
        String[] array = {"Alex", "John"};
        String expected = "Alex, John and 2 others likes this";
        String actual = Facebook.nameDisplayTest(array);
        assertEquals(actual, expected);
    } 
}
