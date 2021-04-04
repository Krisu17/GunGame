package pw.edu.pl.gungame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BoardTest {

    public BoardTest() {
    }

    @Test
    public void testCheckCollisions() {
        System.out.println("checkCollisions");
        GunGame gunGame = new GunGame();
        Board instance = new Board(gunGame);
        Board.playerLeft.fire();
        instance.addBlock(Board.playerLeft.getX(), Board.playerLeft.getY(), 0);
        int oldPlayerPoints = Board.playerLeft.playerPoints;
        instance.checkCollisions(Board.playerLeft);
        boolean successFlag = false;
        if (Board.playerLeft.playerPoints != oldPlayerPoints) {
            successFlag = true;
        }

        assertTrue(successFlag);
    }

}
