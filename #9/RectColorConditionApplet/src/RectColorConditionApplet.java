import java.applet.Applet;
import java.awt.*;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 5/26/15.
 */
public class RectColorConditionApplet extends Applet {

	public void paint(Graphics g) {
		// define margin
		int margin = 10;

		// initialize variables
		int width1, height1, width2, height2;
		width1 = 100;
		height1 = 100;
		width2 = 120;
		height2 = 120;

		// define areas
		int area1 = width1 * height1;
		int area2 = width2 * height2;

		// color condition
		if (area1 >= area2) {
			g.setColor(Color.RED);
		} else {
			g.setColor(Color.BLUE);
		}

		// draw area1
		g.fillRect(margin, margin, width1, height1);
		// draw area2
		g.fillRect(margin + width1 + margin, margin, width2, height2);
	}

}
