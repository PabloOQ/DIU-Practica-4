package mousetrail;

/**
 *
 * @author Pablo
 */
public class Circle implements Figure{
    private Position position;
    private final int radius;

    public Circle(Position position, int radius) {
        this.position = position;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    
    public int getX(){
        return position.getX();
    }
    
    public int getY(){
        return position.getY();
    }
}
