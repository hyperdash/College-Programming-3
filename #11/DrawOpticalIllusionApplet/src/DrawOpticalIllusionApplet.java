import java.applet.Applet;
import java.awt.*;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 6/2/15.
 */
public class DrawOpticalIllusionApplet extends Applet {

	public void paint(Graphics g) {
		// string to draw
		String raw = "アロマ企画アロマ企画アロマ企画アロマ企画アロマ企画アロマ企画アロマ企画";
		String reverse = "画企マロア画企マロア画企マロア画企マロア画企マロア画企マロア画企マロア";

		// initial position
		int x = 50;
		int y = 50;

		// layout factor
		int lineHeight = 20;

		// draw multiple times
		for (int i = 0; i < 10; i++) {
			// which string to draw?
			String str = i % 2 == 0 ? raw : reverse;

			// draw it
			g.drawString(str, x, y);

			// prep position of the next line
			y += lineHeight;
		}
	}

}
