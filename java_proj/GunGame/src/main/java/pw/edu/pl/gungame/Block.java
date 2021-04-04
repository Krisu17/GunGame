package pw.edu.pl.gungame;

import java.awt.Color;
import java.util.Random;

public class Block extends Sprite {

    private double dy;
    public int points;
    private Color color;
    
    
    public Block(double x, double y, double speed) {
        super(x, y);
        dy = speed;
        initBlock();
    }

    protected static int getRandomNumber(int min, int max) {

        Random r = new Random();
        return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();

    }

    private void initBlock() {
        int r = getRandomNumber(0, Board.numberOfBlocks-1);
        Color c = new Color(Board.blockColors[r][0], Board.blockColors[r][1], Board.blockColors[r][2]); // RGB
        color = c;
        points = Board.blockPoints[r][0];
        this.width = getRandomNumber(1 , Board.getMaxWidth());
        this.height = getRandomNumber(1, Board.getMaxHeight());
    }

    public void move() {
        y += dy;
    }

    public double getDy() {
        return dy;
    }
    
    public Color getColor() {
        return color;
    }

}
