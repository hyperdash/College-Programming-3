package applet;

import lec0801util.MyCar;

import java.applet.Applet;
import java.awt.*;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 7/5/16.
 */
public class Lecture08_1 extends Applet {

	public void paint(Graphics g) {
		// instantiate a car
		MyCar car = new MyCar("Tesla Model S", 416, 210);

		// display car info
		g.drawString("車名: " + car.getCarName() +
				" 馬力: " + car.getHorsePower() +
				" 時速: " + car.getMaxSpeed(), 30, 30);
	}

}
