package applet;

import lec0501util.PointCardAccount;

import java.applet.Applet;
import java.awt.*;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 6/19/16.
 */
public class Lecture05_1 extends Applet {

	// define point card
	private PointCardAccount card;

	public void init() {
		// instantiate point card
		card = new PointCardAccount();
		card.initPointCardAccount("John Smith", 1234, 5678);
	}

	public void paint(Graphics g) {
		// display card info
		g.drawString("名前: " + card.getName() +
				" 暗証番号: " + card.getPersonalCode() +
				" 残りポイント: " + card.getBalancePoint() + " ポイント", 30, 30);
	}

}
