import java.applet.Applet;
import java.awt.*;
import java.util.Calendar;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 6/8/15.
 */
public class ClockWithScaleApplet extends Applet {

	public void paint(Graphics g) {
		// define layout factors
		int margin = 40;
		int size = 200;

		// get time
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);

		// coefficient to convert degree into radian
		double c = Math.PI / 180.0;

		// lengths of hands
		double rHour = size / 2 * 0.6;
		double rMin = size / 2 * 0.8;
		double rSec = size / 2 * 0.8;

		// calc center coordinate
		int centerX = margin + size / 2;
		int centerY = margin + size / 2;

		// calc coordinates of the hands' end points
		double degreeHour = 360.0 / 720.0 * (hour * 60 + min);
		double radianHour = degreeHour * c;
		double degreeMin = 360.0 / 60 * min;
		double radianMin = degreeMin * c;
		double degreeSec = 360.0 / 60 * sec;
		double radianSec = degreeSec * c;
		double degreeSec2 = degreeSec + 180;
		double radianSec2 = degreeSec2 * c;
		int endXHour = centerX + (int) Math.round(rHour * Math.sin(radianHour));
		int endYHour = centerY + (int) Math.round(rHour * Math.cos(radianHour)) * -1;
		int endXMin = centerX + (int) Math.round(rMin * Math.sin(radianMin));
		int endYMin = centerY + (int) Math.round(rMin * Math.cos(radianMin)) * -1;
		int endXSec = centerX + (int) Math.round(rSec * Math.sin(radianSec));
		int endYSec = centerY + (int) Math.round(rSec * Math.cos(radianSec)) * -1;
		int beginXSec = centerX + (int) Math.round((size / 2 - rMin) * Math.sin(radianSec2));
		int beginYSec = centerY + (int) Math.round((size / 2 - rMin) * Math.cos(radianSec2)) * -1;

				// draw outline
		g.drawOval(margin, margin, size, size);

		// length of scale
		double rScale = (size / 2) - (size / 2 * 0.2);

		// draw scale
		g.setColor(Color.GRAY);
		for (int i = 0; i < 12; i++) {
			int degree = 360 / 12 * i;
			double radian = degree * c;

			int beginX = centerX + (int) Math.round(rScale * Math.sin(radian));
			int beginY = centerY + (int) Math.round(rScale * Math.cos(radian)) * -1;
			int endX = centerX + (int) Math.round(size / 2 * Math.sin(radian));
			int endY = centerY + (int) Math.round(size / 2 * Math.cos(radian)) * -1;

			g.drawLine(beginX, beginY, endX, endY);
		}

		// draw hands
		g.setColor(Color.BLACK);
		g.drawLine(centerX, centerY, endXHour, endYHour);
		g.drawLine(centerX, centerY, endXMin, endYMin);
		g.setColor(Color.RED);
		g.drawLine(beginXSec, beginYSec, endXSec, endYSec);
	}

}
