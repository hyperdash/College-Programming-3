package applet;

import lec0802util.MyCar;

import java.applet.Applet;
import java.awt.*;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 7/5/16.
 */
public class Lecture08_2 extends Applet {

	public void paint(Graphics g) {
		// instantiate cars
		MyCar[] cars = {
				new MyCar("フェラーリ", 490, 315),
				new MyCar("ランボルギーニ", 510), new MyCar("ポルシェ", 310, 300),
				new MyCar("カローラ", 100)
		};

		// find one has the greatest horse power
		int currentMaxHorsePower = 0;
		MyCar foundCar = null;
		for (MyCar car : cars) {
			if (car.getHorsePower() > currentMaxHorsePower) {
				foundCar = car;
				currentMaxHorsePower = car.getHorsePower();
			}
		}
		if (foundCar == null) {
			return;
		}

		// display car info
		g.drawString("車名: " + foundCar.getCarName() +
				" 馬力: " + foundCar.getHorsePower(), 30, 30);
	}

}
