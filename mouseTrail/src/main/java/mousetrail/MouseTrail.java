package mousetrail;

import java.awt.Color;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Pablo
 */
public class MouseTrail {

    private final Circle circle;
    private final Queue trail;
    private final int maxTrail;
    private Color color;

    public MouseTrail(Circle circle, int maxTrail, Color color) {
        this.circle = circle;
        this.trail = new LinkedList<Position>();
        this.maxTrail = maxTrail;
        this.color = color;
    }

    public void add(Position position) {
        if (trail.size() < maxTrail) {
            trail.add(position);
        } else {
            trail.remove();
            trail.add(position);
        }
    }
    
    public Position[] getTrail(){
        return (Position[]) trail.toArray(new Position[trail.size()]);
    }
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public int getRadius(){
        return circle.getRadius();
    }
}
