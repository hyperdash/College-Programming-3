import java.applet.Applet;
import java.awt.*;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 5/26/15.
 */
public class ShapeConditionApplet extends Applet {

	public void paint(Graphics g) {
		// define margin
		int margin = 10;

		// define a factor variable
		int number = 120;

		// conditions
		// number is greater than 100 and even number
		if (number >= 100 && number % 2 == 0) {
			// draw circle
			g.drawOval(margin, margin, 100, 100);
		}
		// number is greater than 100 or even number
		else if (number >= 100 || number % 2 == 0) {
			// draw square
			g.drawRect(margin, margin, 100, 100);
		}
		// in other cases
		else {
			// draw cross
			g.drawLine(margin, margin, margin + 100, margin + 100);
			g.drawLine(margin + 100, margin, margin, margin + 100);
		}
	}

}
