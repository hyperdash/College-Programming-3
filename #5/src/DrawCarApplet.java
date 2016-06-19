/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 5/8/15.
 */

import java.awt.*;
import java.applet.*;

public class DrawCarApplet extends Applet {

	public void paint(Graphics g) {
		g.setColor(Color.darkGray);
		g.fillOval(130, 190, 40, 40); // background tires
		g.fillOval(220, 190, 40, 40);
		g.setColor(Color.red);
		g.fillArc(100, 100, 170, 130, 0, 180); // roof
		g.fillRect(90, 160, 240, 50); // body
		g.setColor(Color.blue);
		g.fillArc(110, 110, 150, 100, 0, 180); // glass
		g.setColor(Color.yellow);
		g.fillOval(100, 180, 20, 20); // lights
		g.fillOval(170, 180, 20, 20);
		g.setColor(Color.black);
		g.fillOval(190, 190, 40, 40); // foreground tires
		g.fillOval(280, 190, 40, 40);
	}

}
