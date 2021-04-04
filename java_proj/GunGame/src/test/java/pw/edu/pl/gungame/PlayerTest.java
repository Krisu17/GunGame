package pw.edu.pl.gungame;

import java.awt.event.KeyEvent;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import static pw.edu.pl.gungame.Board.BOARDHEIGHT;

public class PlayerTest {

    public PlayerTest() {
    }

    @Test
    public void testFire() {
        System.out.println("fire");
        final int playerLeftMoveLeft = KeyEvent.VK_A;
        final int playerLeftMoveRight = KeyEvent.VK_S;
        final int playerLeftTurnLeft = KeyEvent.VK_Z;
        final int playerLeftTurnRight = KeyEvent.VK_X;
        final int playerLeftFire = KeyEvent.VK_C;

        Player playerLeft = new Player(150, BOARDHEIGHT - 75, playerLeftMoveLeft,
                playerLeftMoveRight, playerLeftTurnLeft, playerLeftTurnRight,
                playerLeftFire);
        int oldSizeMissilies = (playerLeft.getMissiles()).size();

        playerLeft.fire();

        boolean successFlag = false;
        if ((playerLeft.getMissiles()).size() != oldSizeMissilies) {
            successFlag = true;
        }
        assertTrue(successFlag);

    }

}
