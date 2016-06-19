import java.applet.Applet;
import java.awt.*;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 6/2/15.
 */
public class DrawNameApplet extends Applet {

	public void paint(Graphics g) {
		// define name to draw
		String name = "Kazuhiro Kosaka";

		// initial position
		int x = 50;
		int y = 50;

		// layout factors
		int indent = 20;
		int lineHeight = 20;

		// draw 10 times
		for (int i = 0; i < 10; i++) {
			// change color
			if (i % 4 == 0) {
				g.setColor(Color.BLUE);
			} else {
				g.setColor(Color.RED);
			}

			// draw
			g.drawString(name, x, y);
			x += indent;
			y += lineHeight;
		}
	}

}
