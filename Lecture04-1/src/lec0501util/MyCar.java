package lec0501util;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 6/19/16.
 */
public class MyCar {

	// name
	private String carName;

	// horse power
	private int horsePower;

	// maximum speed
	private int maxSpeed;

	// set fields
	public void setCar(String name, int power, int speed) {
		this.carName = name;
		this.horsePower = power;
		this.maxSpeed = speed;
	}

	// getters
	public String getCarName() {
		return carName;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

}
