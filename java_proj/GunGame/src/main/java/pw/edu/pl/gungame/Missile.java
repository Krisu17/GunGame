package pw.edu.pl.gungame;


public class Missile extends Sprite {

    public final int MISSILE_SPEED = 2;
    public double cos;
    public double sin;
    public double thetaM;

    public Missile(double x, double y, double theta) {
        super(x, y);
        this.thetaM = theta;
        
        initMissile();
    }
    
    private void initMissile() {
        
        loadImage("src/resources/missile.png");  
        getImageDimensions();
    }

    public void move() {
       this.sin = Math.sin(this.thetaM - Math.PI / 2);
       this.cos = Math.cos(this.thetaM - Math.PI / 2);
       this.y = this.y + (this.MISSILE_SPEED * this.sin);
       this.x = this.x + (this.MISSILE_SPEED * this.cos);
        
        if (x > Board.BOARDWIDTH || y > Board.BOARDHEIGHT || x < 0 || y < 0) {
            visible = false;
        }
    }
    
    
}