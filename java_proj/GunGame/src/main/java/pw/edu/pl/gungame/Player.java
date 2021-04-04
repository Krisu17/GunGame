package pw.edu.pl.gungame;
//
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.util.List;

public class Player extends Sprite {

    public String playerName;
    public double dx;
    private double da;
    public double gunAngle;
    public double maxGunAngle;
    public int playerPoints;
    public Body body;
    public Gun gun;
    private int keyMoveLeft;
    private int keyMoveRight;
    private int keyTurnLeft;
    private int keyTurnRight;
    private int keyFire;
    private List<Missile> missiles;
    AffineTransform at = new AffineTransform();

    public Player(double x, double y, int keyMoveLeft, int keyMoveRight,
            int keyTurnLeft, int keyTurnRight, int keyFire) {
        super(x, y);
        initTank(x, y);
        this.keyMoveLeft = keyMoveLeft;
        this.keyMoveRight = keyMoveRight;
        this.keyTurnLeft = keyTurnLeft;
        this.keyTurnRight = keyTurnRight;
        this.keyFire = keyFire;
    }

    private void initTank(double x, double y) {

        missiles = new ArrayList<>();

        body = new Body(x, y);
        gun = new Gun(x, y);
        this.width = body.width;
        this.height = body.height;
    }

    public void move() {
        this.x += this.dx;
        if (Math.abs(this.gunAngle + this.da) <= this.maxGunAngle) {
            this.gunAngle += this.da;
        }

    }

    public List<Missile> getMissiles() {
        return missiles;
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == keyMoveLeft) {
            dx = -1;
        }
        if (key == keyMoveRight) {
            dx = 1;
        }
        if (key == keyTurnLeft) {
            da = -0.02;
        }
        if (key == keyTurnRight) {
            da = 0.02;
        }
        if (key == keyFire) {
            if(missiles.size() < 3)
            fire();
        }

    }

    public void fire() {
        missiles.add(new Missile(x + 15 + Math.sin(this.theta) * 42,
                y + 41 - Math.cos(this.theta) * 40, this.getTheta()));
    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == keyMoveLeft) {
            dx = 0;
        }
        if (key == keyMoveRight) {
            dx = 0;
        }
        if (key == keyTurnLeft) {
            da = 0;
        }
        if (key == keyTurnRight) {
            da = 0;
        }
    }

    public void draw(Graphics2D g2d, double theta) {
        at.setToIdentity();
        at.rotate(theta, x + 20, y + 45);
        at.translate(x, y);
        g2d.drawImage(gun.image, at, null);

    }

}
