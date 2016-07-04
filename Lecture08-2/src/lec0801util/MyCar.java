package lec0801util;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 7/5/16.
 */
public class MyCar {

	// fields
	private String carName;
	private int horsePower;
	private int maxSpeed;

	// constructor
	public MyCar(String carName, int horsePower, int maxSpeed) {
		this.carName = carName;
		this.horsePower = horsePower;
		this.maxSpeed = maxSpeed;
	}

	// sub constructor
	public MyCar(String carName, int horsePower) {
		this.carName = carName;
		this.horsePower = horsePower;
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
