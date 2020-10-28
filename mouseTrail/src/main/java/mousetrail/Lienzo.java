package mousetrail;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Pablo
 */
public class Lienzo extends JPanel {
    
    private MouseTrail trail;
    private int mouseUpdate = 0;

    public Lienzo() {
        super();
        this.setMouseTrail(new Circle(new Position(0, 0), 10));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(trail.getColor());
        mouseTrail(g);
    }
    
    public void setMouseTrailColor(Color color){
        trail.setColor(color);
    }
    
    public void setMouseTrail(Circle circle){
        this.trail = new MouseTrail(circle, 5, Color.BLACK);        
    }
        
    public void updateMouseTrail(Position position){
        mouseUpdate++;
        if(mouseUpdate > 10){
            mouseUpdate = 0;
            trail.add(position);
            this.repaint();
        }
    }
    
    private void mouseTrail(Graphics g) {
        Position[] trail = this.trail.getTrail();
        for (Position position : trail) {
            fillCircle(position, g);
        }
    }
    
    private void fillCircle(Position position, Graphics g){
        g.fillOval(position.getX(), position.getY(), trail.getRadius(), trail.getRadius());
    }
    
}
