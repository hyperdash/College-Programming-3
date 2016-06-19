import java.applet.Applet;
import java.awt.*;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 5/15/15.
 */
public class RedCircleMultiplierApplet extends Applet {

	public void paint(Graphics g) {
		// set color red
		g.setColor(Color.RED);

		// define initial coordinate
		int x = 10;
		int y = 10;

		// draw 10 circles filled in red
		for (int i = 0; i < 10; i += 1) {
			// fill circle with a diameter of 25
			g.fillOval(x, y, 25, 25);
			// move next circle +20 in horizontal direction
			x += 20;
			// move next circle +10 in vertical direction
			y += 10;
		}
	}

}
