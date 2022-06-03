import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestingSILab2 {
@Test
    public void testException(){

    List<String> myList = new ArrayList<>();
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
     SILab2.function(myList);
    });
    String exceptedMessage = "List length should be greater than 0";
    String actualMessage = exception.getMessage();
    assertTrue(actualMessage.contains(exceptedMessage));
}
    @Test
    public void testSecondException() {

        List<String> myList = new ArrayList<>();
        myList.add("0");
        myList.add("0");
        myList.add("0");
        myList.add("#");
        myList.add("0");
        myList.add("#");
        myList.add("#");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            SILab2.function(myList);
        });
        String exceptedMessage = "List length should be a perfect square";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(exceptedMessage));
    }

}
