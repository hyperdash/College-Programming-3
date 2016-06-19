import java.applet.Applet;
import java.awt.*;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 6/19/16.
 */
public class Lecture03 extends Applet {

	public void paint(Graphics g) {
		// values
		int to[] = {2, 4, 5, 1, 3};
		int syou[] = {2, 3, 5, 1, 4};
		int gou[] = {4, 2, 3, 1, 5};

		MyVolume sum = new MyVolume();
		MyVolume v = new MyVolume();

		// add values to sum and update sum
		for (int i = 0; i < 5; i++) {
			v.setVolume(to[i], syou[i], gou[i]);
			sum = sum.add(v);
		}

		// display the result
		g.drawString("合計=" +
				sum.getTo() + "斗 " +
				sum.getSyou() + "升 " +
				sum.getGou() + "合", 30, 30);
	}

}
