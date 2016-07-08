package lec1101util;

/**
 * @author kosaka_kazuhiro@cyberagent.co.jp
 *         Created on 7/7/16.
 */
public class ColorCircle extends Circle {

	// field definitions
	private int	colorRed;
	private int	colorGreen;
	private int	colorBlue;

	// set all parameters
	public void setColorCircle(int x, int y, int d, int r, int g, int b) {
		xPosition = x;
		yPosition = y;
		diameter = d;
		colorRed = r;
		colorGreen = g;
		colorBlue = b;
	}

	// getter methods
	public int getColorRed() {
		return colorRed;
	}

	public int getColorGreen() {
		return colorGreen;
	}

	public int getColorBlue() {
		return colorBlue;
	}

}
