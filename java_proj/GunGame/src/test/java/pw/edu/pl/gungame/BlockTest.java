package pw.edu.pl.gungame;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class BlockTest {

    public BlockTest() {
    }

    @Test
    public void testGetRandomNumber() {
        System.out.println("getRandomNumber");
        int min = 0;
        int max = 10;
        int result;
        boolean successFlag = true;
        for (int i = 0; i < 10; i++) {
            result = Block.getRandomNumber(min, max);
            if (result < min || result > max) {
                successFlag = false;
            }
        }
        assertTrue(successFlag);
    }

}
