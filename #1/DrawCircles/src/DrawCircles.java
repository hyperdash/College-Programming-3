import java.applet.Applet;
import java.awt.*;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 6/15/16.
 */
public class DrawCircles extends Applet {

	// number of circles to be drawn
	private static int NUMBER_OF_CIRCLES = 100;
	// max value of the diameters
	private static int MAX_DIAMETER = 100;

	// vertical margin
	private static int Y = 10;
	// initial horizontal position
	private static int X = 10;

	// array of diameter values
	private int diameters[] = new int[NUMBER_OF_CIRCLES];

	/**
	 * Initialize.
	 */
	public void init() {
		// initialize diameters array
		// each of the diameter values will be between -200 and 200
		for (int i = 0; i < diameters.length; i++) {
			diameters[i] = Double.valueOf(Math.random() * MAX_DIAMETER * 2 - MAX_DIAMETER).intValue();
		}

		// sort diameters array in asc
		ascendingSort();

		// debug
		//printDebug();
	}

	/**
	 * Draw circles.
	 *
	 * @param g
	 */
	public void paint(Graphics g) {
		drawCircles(g);
	}

	/**
	 * Draw circles main.
	 */
	private void drawCircles(Graphics g) {
		// the horizontal position of the right edge of the previous one
		int x = X;

		for (int i = 0; i < diameters.length; i++) {
			int diameter = diameters[i];

			// filter ones which value is a positive number
			if (diameter < 1) continue;

			// draw circle
			drawCircle(g, x, Y, diameter);

			// update the position
			x += diameter;
		}

		// draw line
		drawLine(g, X, Y, x - X);
	}

	/**
	 * Draw a circle.
	 *
	 * @param g
	 * @param x
	 * @param y
	 * @param diameter
	 */
	private void drawCircle(Graphics g, int x, int y, int diameter) {
		g.drawOval(x, y, diameter, diameter);
	}

	/**
	 * Draw a line.
	 *
	 * @param g
	 * @param x
	 * @param y
	 * @param length
	 */
	private void drawLine(Graphics g, int x, int y, int length) {
		g.drawLine(x, y, x + length, y);
	}

	/**
	 * Sort diameters in ascending order.
	 */
	private void ascendingSort() {
		for (int i = 0; i < diameters.length - 1; i++){
			for (int j = i + 1; j < diameters.length; j++){
				if(diameters[j]< diameters[i]){
					int tmp = diameters[j];
					diameters[j] = diameters[i];
					diameters[i] = tmp;
				}
			}
		}
	}

	/**
	 * Print each of elements in diameters.
	 */
	private void printDebug() {
		for (int i = 0; i < diameters.length; i++) {
			System.out.println(diameters[i]);
		}
	}

}
