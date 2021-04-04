
package pw.edu.pl.gungame;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Inserter extends Thread {

    Board board;
    public double speed;
    long sleep = 1000;
    public boolean running = true;

    Inserter(Board b) {
        board = b;
    }

    private static int getRandomNumber(int min, int max) {

        Random r = new Random();
        return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();

    }

    public void setSpeed(double x) {
        speed = x;
    }

    @Override
    public void run() {
        int x;
        while (true) {
            if (running) {
                x = getRandomNumber(0, board.BOARDWIDTH - 50);
                board.addBlock(x, 0, speed);
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Inserter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else {
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Inserter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
