import java.applet.Applet;
import java.awt.*;
import java.util.Calendar;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 6/8/15.
 */
public class ClockApplet extends Applet {

	public void paint(Graphics g) {
		// define layout factors
		int margin = 20;
		int size = 100;

		// get time
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);

		// coefficient to convert degree into radian
		double c = Math.PI / 180.0;

		// lengths of hands
		double rHour = size / 2 * 0.6;
		double rMin = size / 2 * 0.8;

		// calc center coordinate
		int centerX = margin + size / 2;
		int centerY = margin + size / 2;

		// calc coordinates of the hands' end points
		double degreeHour = 360.0 / 720.0 * (hour * 60 + min);
		double radianHour = degreeHour * c;
		double degreeMin = 360.0 / 60 * min;
		double radianMin = degreeMin * c;

		int endXHour = centerX + (int) Math.round(rHour * Math.sin(radianHour));
		int endYHour = centerY + (int) Math.round(rHour * Math.cos(radianHour)) * -1;
		//int endXMin;
		//int endYMin;
		int endXMin = centerX + (int) Math.round(rMin * Math.sin(radianMin));
		int endYMin = centerY + (int) Math.round(rMin * Math.cos(radianMin)) * -1;

		// draw outline
		g.drawOval(margin, margin, size, size);

		// draw hands
		g.drawLine(centerX, centerY, endXHour, endYHour);
		g.drawLine(centerX, centerY, endXMin, endYMin);
	}

}
