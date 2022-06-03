# SI_2022_lab2_133010
Нерма Муминовиќ 133010

# Control Flow Graph
![control flow graph si_lab2](https://user-images.githubusercontent.com/100517872/171938792-7d3c9e0f-6ae2-46f8-ad44-85beb8a4145d.png)

# Цикломатска комплексност
Графот содржи 25 темиња и 32 ребра. Користејќи ја формулата V(G) = Edges - Nodes + 2, го добивам
следново:
32 - 27 + 2 = 9, па одтука цикломатската комплексност е 9.

# Test Cases

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
