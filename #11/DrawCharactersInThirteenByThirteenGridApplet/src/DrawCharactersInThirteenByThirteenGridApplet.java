import java.applet.Applet;
import java.awt.*;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 6/2/15.
 */
public class DrawCharactersInThirteenByThirteenGridApplet extends Applet {

	public void paint(Graphics g) {
		// define characters
		String charA = "@";
		String charB = "#";
		String charC = "&";

		// unique index
		int index = 0;

		// initial position
		int initialX = 50;
		int y = 50;

		// layout factors
		int gridWidth = 20;
		int gridHeight = 20;

		for (int i = 0; i < 13; i++) {
			// initialize position
			int x = initialX;

			for (int j = 0; j < 13; j++) {
				// which character to draw?
				String str = index % 3 == 0 ? charC : index % 2 == 0 ? charB : charA;

				// change color
				int c = 5 - (j % 5);
				switch (c) {
					case 5:
					case 1:
						g.setColor(Color.RED);
						break;
					case 4:
					case 3:
						g.setColor(Color.BLUE);
						break;
					case 2:
					default:
						g.setColor(Color.GREEN);
				}

				// draw character
				g.drawString(str, x, y);

				// prep position of the next col
				x += gridWidth;

				// increment index
				index++;
			}

			// prep position of the next row
			y += gridHeight;
		}

	}

}
