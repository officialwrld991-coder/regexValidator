import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestTest {
    @Test
    public void testShortest() {
       String word = "God go take you .";
       String returned = "go";
       String actual = Shortest.getShortestWord(word);
       assertEquals(returned, actual);
    }
}
