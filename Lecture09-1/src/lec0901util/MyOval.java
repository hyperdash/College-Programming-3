package lec0901util;

/**
 * @author kosaka_kazuhiro@cyberagent.co.jp
 *         Created on 7/5/16.
 */
public class MyOval {

	// field definitions
	private int xPosition;
	private int yPosition;
	private int radius;
	private int colorRed;
	private int colorGreen;
	private int colorBlue;

	/**
	 * Default constructor
	 *
	 * @param xPosition
	 * @param yPosition
	 * @param radius
	 * @param colorRed
	 * @param colorGreen
	 * @param colorBlue
	 */
	public MyOval(int xPosition, int yPosition, int radius, int colorRed, int colorGreen, int colorBlue) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.radius = radius;
		this.colorRed = colorRed;
		this.colorGreen = colorGreen;
		this.colorBlue = colorBlue;
	}

	/**
	 * Sub constructor
	 *
	 * @param xPosition
	 * @param yPosition
	 * @param radius
	 */
	public MyOval(int xPosition, int yPosition, int radius) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.radius = radius;
		this.colorRed = 0;
		this.colorGreen = 0;
		this.colorBlue = 255;
	}

	// getter methods
	public int getX() {
		return xPosition;
	}
	public int getY() {
		return yPosition;
	}
	public int getR() {
		return radius;
	}
	public int getRed() {
		return colorRed;
	}
	public int getGreen() {
		return colorGreen;
	}
	public int getBlue() {
		return colorBlue;
	}

	// setter methods
	public void setRed(int colorRed) {
		this.colorRed = colorRed;
	}
	public void setGreen(int colorGreen) {
		this.colorGreen = colorGreen;
	}
	public void setBlue(int colorBlue) {
		this.colorBlue = colorBlue;
	}

	/**
	 * Return if the given another oval is overlapping with this oval
	 *
	 * @param another
	 * @return
	 */
	public boolean isCollision(MyOval another) {
		// calculate the coordinates for the center of the ovals
		double centerX = xPosition + radius * Math.cos(45 * (Math.PI / 180));
		double centerY = yPosition + radius * Math.sin(45 * (Math.PI / 180));
		double anotherCenterX = another.getX() + radius * Math.cos(45 * (Math.PI / 180));
		double anotherCenterY = another.getY() + radius * Math.sin(45 * (Math.PI / 180));

		// calculate the distance of the ovals
		double distance = Math.sqrt(Math.pow(centerX - anotherCenterX, 2) + Math.pow(centerY - anotherCenterY, 2));

		// if they are overlapping
		return distance < another.getR() + radius;
	}

}
