package applet;

import lec0501util.MyCar;

import java.applet.Applet;
import java.awt.*;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 6/19/16.
 */
public class Lecture04_01 extends Applet {

	// define car
	private MyCar car;

	public void init() {
		// instantiate a car
		car = new MyCar();
		car.setCar("Tesla Model S", 416, 210);
	}

	public void paint(Graphics g) {
		// display car info
		g.drawString("車名: " + car.getCarName() +
				" 馬力: " + car.getHorsePower() +
				" 時速: " + car.getMaxSpeed(), 30, 30);
	}

}
