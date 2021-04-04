package pw.edu.pl.gungame;


class Gun extends Sprite {
    
    
    public Gun(double x, double y) {
        super(x, y);
        loadImage("src/resources/gun.png");
        getImageDimensions();
    }
}
