import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MultipleTest {
    @Test
    public void multipleTest(){
        int [] number = {-5, -3, 0, 1,2,3};

        int [] expected = {1,4,9};

        int [] actual = Multiple.getNumberSqaure(number);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }
}
