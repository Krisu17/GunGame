package pw.edu.pl.gungame;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {

    public static final int BOARDWIDTH = 907;
    public static final int BOARDHEIGHT = 579;
    private final int DELAY = 10;
    public Timer timer;
    public static Player playerLeft;
    public static Player playerRight;
    private List<Block> blocks;
    private final int playerLeftMoveLeft = KeyEvent.VK_A;
    private final int playerLeftMoveRight = KeyEvent.VK_S;
    private final int playerLeftTurnLeft = KeyEvent.VK_Z;
    private final int playerLeftTurnRight = KeyEvent.VK_X;
    private final int playerLeftFire = KeyEvent.VK_C;
    private final int playerRightMoveLeft = KeyEvent.VK_SEMICOLON;
    private final int playerRightMoveRight = KeyEvent.VK_QUOTE;
    private final int playerRightTurnLeft = KeyEvent.VK_PERIOD;
    private final int playerRightTurnRight = KeyEvent.VK_SLASH;
    private final int playerRightFire = KeyEvent.VK_COMMA;
    public File config = new File("src/resources/defaultConfig.txt");
    private final ImageIcon background = new ImageIcon("src/resources/background.png");
    private Image img;
    private int level = 0;
    public static int threshold = 1;
    private Writer writer;
    private GunGame gui;
    public static int numberOfBlocks;
    private static int maxWidth;
    private static int maxHeight;
    public static int[][] blockColors;
    public static int[][] blockPoints;
    public Inserter inserter;

    public Board() {
    }

    public Board(GunGame gunGame) {
        gui = gunGame;
        initBoard();
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public Writer getWriter() {
        return writer;
    }

    public Player getPlayerLeft() {
        return playerLeft;
    }

    public Player getPlayerRight() {
        return playerRight;
    }

    public static void setMaxWidth(int maxWidth) {
        Board.maxWidth = maxWidth;
    }

    public static void setMaxHeight(int maxHeight) {
        Board.maxHeight = maxHeight;
    }

    public static int getMaxWidth() {
        return maxWidth;
    }

    public static int getMaxHeight() {
        return maxHeight;
    }   
    

    private void initBoard() {
        addKeyListener(new TAdapter());
        setFocusable(true);
        playerLeft = new Player(150, BOARDHEIGHT - 75, playerLeftMoveLeft,
                playerLeftMoveRight, playerLeftTurnLeft, playerLeftTurnRight,
                playerLeftFire);
        playerRight = new Player(BOARDWIDTH - 150, BOARDHEIGHT - 75,
                playerRightMoveLeft, playerRightMoveRight, playerRightTurnLeft,
                playerRightTurnRight, playerRightFire);
        initBlocks();
        timer = new Timer(DELAY, this);
        timer.setInitialDelay(1000);
        inserter = new Inserter(this);
        inserter.start();
        inserter.running = false;
        read();
        gui.getPlayerLeftLabel().setText(playerLeft.playerName + "score");
        gui.getPlayerRightLabel().setText(playerRight.playerName + "score");
        gui.getLeftPlayerText().setText(Integer.toString(playerLeft.playerPoints));
        gui.getRightPlayerText().setText(Integer.toString(playerRight.playerPoints));
        writer = new Writer();
        Image temp = background.getImage();
        img = temp.getScaledInstance(BOARDWIDTH, BOARDHEIGHT, Image.SCALE_SMOOTH);

    }

    public void read() {
        Scanner inputScanner = null;
        try {
            inputScanner = new Scanner(config);
        } catch (FileNotFoundException ex) {
            System.out.println("Nie znaleziono pliku konfiguracyjnego!");
            return;
        }
        Reader reader = new Reader(inserter, config, inputScanner, this);
        if (reader.readFile() > 0) {
            gui.getErrorDialog().setVisible(true);
        }

    }

    public void reset() {
        List<Missile> missilesLeft = playerLeft.getMissiles();
        List<Missile> missilesRight = playerRight.getMissiles();

        for (Iterator<Block> it = blocks.iterator(); it.hasNext();) {
            Block next = it.next();
            it.remove();

        }
        for (Iterator<Missile> it = missilesLeft.iterator(); it.hasNext();) {
            Missile next = it.next();
            it.remove();
        }
        for (Iterator<Missile> it = missilesRight.iterator(); it.hasNext();) {
            Missile next = it.next();
            it.remove();
        }
    }

    private void clean() {
        List<Missile> missilesLeft = playerLeft.getMissiles();
        List<Missile> missilesRight = playerRight.getMissiles();

        for (Iterator<Block> it = blocks.iterator(); it.hasNext();) {
            Block next = it.next();
            if (!next.isVisible()) {
                it.remove();
            }
        }
        for (Iterator<Missile> it = missilesLeft.iterator(); it.hasNext();) {
            Missile next = it.next();
            if (!next.isVisible()) {
                it.remove();
            }
        }
        for (Iterator<Missile> it = missilesRight.iterator(); it.hasNext();) {
            Missile next = it.next();
            if (!next.isVisible()) {
                it.remove();
            }
        }
    }

    private void initBlocks() {
        blocks = new ArrayList<>();
    }

    public void addBlock(double x, double y, double speed) {
        blocks.add(new Block(x, y, speed));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);

        Toolkit.getDefaultToolkit().sync();
    }

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g.drawImage(img, 0, 0, this);
        g2d.drawImage(playerLeft.body.image, (int) playerLeft.getX(), (int) playerLeft.getY(), this);
        playerLeft.draw(g2d, playerLeft.theta);
        g2d.drawImage(playerRight.body.image, (int) playerRight.getX(), (int) playerRight.getY(), this);
        playerRight.draw(g2d, playerRight.theta);

        List<Missile> missilesLeft = playerLeft.getMissiles();
        List<Missile> missilesRight = playerRight.getMissiles();
        checkCollisions(playerLeft);
        checkCollisions(playerRight);
        for (Missile missile : missilesLeft) {
            missile.move();
            g2d.drawImage(missile.getImage(), (int) missile.getX(), (int) missile.getY(), this);
        }

        for (Missile missile : missilesRight) {
            missile.move();
            g2d.drawImage(missile.getImage(), (int) missile.getX(), (int) missile.getY(), this);
        }

        for (Block block : blocks) {
            block.move();
            Rectangle2D rect = block.getBounds();
            g2d.setColor(block.getColor());
            g2d.fill(rect);
        }

        if (playerLeft.playerPoints / threshold > level || playerRight.playerPoints / threshold > level) {
            level++;
            inserter.speed += 0.25;
            gui.getLevel().setText("Level " + Integer.toString(level));
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clean();
        updateMissiles();
        updateTanks();
        updateBlocks();
        repaint();
    }

    private void updateMissiles() {

        playerLeft.theta = playerLeft.gunAngle;
        playerRight.theta = playerRight.gunAngle;
        List<Missile> missilesLeft = playerLeft.getMissiles();
        List<Missile> missilesRight = playerRight.getMissiles();

        for (int i = 0; i < missilesLeft.size(); i++) {
            Missile missileLeft = missilesLeft.get(i);

            missileLeft.move();
        }

        for (int i = 0; i < missilesRight.size(); i++) {
            Missile missileRight = missilesRight.get(i);

            missileRight.move();

        }
    }

    private void updateTanks() {
        if (playerLeft.getX() + playerLeft.dx > 0 && !(playerLeft.getX() + playerLeft.dx + 40 > playerRight.getX())) {
            playerLeft.move();
        }
        if (playerRight.getX() + playerRight.dx + 40 < BOARDWIDTH && !(playerRight.getX() + playerRight.dx < playerLeft.getX() + 40)) {
            playerRight.move();
        }
    }

    private void updateBlocks() {

        for (int i = 0; i < blocks.size(); i++) {

            Block a = blocks.get(i);

            Rectangle2D b = a.getBounds();
            Rectangle2D pl = playerLeft.getBounds();
            Rectangle2D pr = playerRight.getBounds();

            if (b.intersects(pl)) {
                a.setVisible(false);
                playerLeft.playerPoints -= a.points;
                gui.getLeftPlayerText().setText(Integer.toString(playerLeft.playerPoints));
            } else if (b.intersects(pr)) {
                a.setVisible(false);
                playerRight.playerPoints -= a.points;
                gui.getRightPlayerText().setText(Integer.toString(playerRight.playerPoints));
            }

            a.move();

        }
    }

    public void checkCollisions(Player player) {

        List<Missile> msl = player.getMissiles();
        for (Missile m : msl) {
            Rectangle2D r1 = m.getBounds();
            for (Block block : blocks) {
                Rectangle2D r2 = block.getBounds();
                if (r1.intersects(r2)) {
                    m.setVisible(false);
                    block.setVisible(false);
                    player.playerPoints += block.points;
                    if (player == playerLeft) {
                        gui.getLeftPlayerText().setText(Integer.toString(player.playerPoints));
                    } else {
                        gui.getRightPlayerText().setText(Integer.toString(player.playerPoints));
                    }
                }
            }

        }
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            playerLeft.keyReleased(e);
            playerRight.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            playerLeft.keyPressed(e);
            playerRight.keyPressed(e);
        }
    }
}
