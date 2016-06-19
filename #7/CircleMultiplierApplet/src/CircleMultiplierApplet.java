import java.applet.Applet;
import java.awt.*;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 5/15/15.
 */
public class CircleMultiplierApplet extends Applet {

	public void paint(Graphics g) {
		// define initial diameter
		int diameter = 20;

		// draw circles continuously as long as the diameter is less than 90
		while (diameter < 90) {
			// centering in horizontal direction
			int x = 80 - diameter / 2;
			// draw circle
			g.drawOval(x, 10, diameter, diameter);
			// make next circle 10 larger in diameter
			diameter += 10;
		}
	}

}
