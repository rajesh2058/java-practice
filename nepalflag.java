import java.applet.Applet;
import java.awt.*;

public class nepalflag extends Applet {
    public void paint(Graphics g) {
       

        // Draw lower triangle
        int[] xPointsLower = { 50, 50, 150 ,75,200};
        int[] yPointsLower = { 50, 200, 100 ,100,50};
      
        g.setColor(Color.red);
        g.fillPolygon(xPointsLower, yPointsLower, 5);

        // Draw Moon
        g.setColor(Color.red);
        g.fillArc(85, 95, 80, 80, 30, 300);
    }
}
