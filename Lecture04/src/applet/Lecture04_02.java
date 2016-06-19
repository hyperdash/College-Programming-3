package applet;

import lec0501util.MyCar;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 6/19/16.
 */
public class Lecture04_02 extends Applet implements ActionListener {

	// define car
	private MyCar car;

	// define buttons
	private Button nameBtn, powerBtn, speedBtn;

	// store which button is active
	private Object current;

	public void init() {
		// instantiate a car
		car = new MyCar();
		car.setCar("Tesla Model S", 416, 210);

		// instantiate the buttons and register this as an action listener
		nameBtn = new Button("車名");
		nameBtn.addActionListener(this);
		add(nameBtn);

		powerBtn = new Button("馬力");
		powerBtn.addActionListener(this);
		add(powerBtn);

		speedBtn = new Button("時速");
		speedBtn.addActionListener(this);
		add(speedBtn);
	}

	public void paint(Graphics g) {
		// do nothing when current is not set
		if (current == null) return;

		if (current == nameBtn) {
			// display car info
			g.drawString("車名: " + car.getCarName(), 30, 60);
		} else if (current == powerBtn) {
			// display car info
			g.drawString("馬力: " + car.getHorsePower(), 30, 60);
		} else if (current == speedBtn) {
			// display car info
			g.drawString("時速: " + car.getMaxSpeed(), 30, 60);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// set current as the source
		current = e.getSource();

		// display text calling paint method
		repaint();
	}
}
