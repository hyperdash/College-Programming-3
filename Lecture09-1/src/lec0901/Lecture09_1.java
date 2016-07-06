package lec0901;

import lec0901util.MyOval;

import java.applet.Applet;
import java.awt.*;
import java.util.Random;

/**
 * @author kosaka_kazuhiro@cyberagent.co.jp
 *         Created on 7/5/16.
 */
public class Lecture09_1 extends Applet {

	// store generated coordinates and radiuses
	private int coordinates[] = new int[4];
	private int radiuses[] = new int[2];

	public void init() {
		Random r = new Random();
		for (int i = 0; i < coordinates.length; i++) {
			coordinates[i] = r.nextInt(200) + 50; // 50 - 250
		}
		for (int i = 0; i < radiuses.length; i++) {
			radiuses[i] = r.nextInt(80) + 20; // 20 - 100
		}
	}

	public void paint(Graphics g) {
		// instantiate primary oval
		MyOval primary = new MyOval(coordinates[0], coordinates[1], radiuses[0]);

		// draw primary
		int diameterP = primary.getR() * 2;
		g.setColor(new Color(primary.getRed(), primary.getGreen(), primary.getBlue()));
		g.fillOval(primary.getX(), primary.getY(), diameterP, diameterP);

		// instantiate secondary oval
		MyOval secondary = new MyOval(coordinates[2], coordinates[3], radiuses[1], 0, 255, 0);

		// when they are overlapping, then change the secondary's color
		if (primary.isCollision(secondary)) {
			secondary.setRed(255);
			secondary.setGreen(0);
			secondary.setBlue(0);
		}

		// draw secondary
		int diameterS = secondary.getR() * 2;
		g.setColor(new Color(secondary.getRed(), secondary.getGreen(), secondary.getBlue()));
		g.fillOval(secondary.getX(), secondary.getY(), diameterS, diameterS);
	}

}
