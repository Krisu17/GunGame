package pw.edu.pl.gungame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpriteTest {

    public SpriteTest() {
    }

    @Test
    public void testGetImageDimensions() {
        System.out.println("getImageDimensions");
        Sprite instance = new Sprite(0, 0);
        instance.loadImage("src/resources/missile.png");
        instance.getImageDimensions();
        boolean successFlag = false;
        if (instance.height == 10 && instance.width == 10) {
            successFlag = true;
        }
        assertTrue(successFlag);

    }

}
