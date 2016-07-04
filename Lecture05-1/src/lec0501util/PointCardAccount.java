package lec0501util;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 6/19/16.
 */
public class PointCardAccount {

	// name of the owner
	private String name;
	// pin code
	private int personalCode;
	// point balance
	private int balancePoint;

	// initialize this point card
	public void initPointCardAccount(String name, int pin, int balance) {
		this.name = name;
		this.personalCode = pin;
		this.balancePoint = balance;
	}

	// getters
	public String getName() {
		return name;
	}

	public int getPersonalCode() {
		return personalCode;
	}

	public int getBalancePoint() {
		return balancePoint;
	}

	// adding points
	public void purchasePoint(int amount) {
		balancePoint += amount;
	}

	// subtract points
	public void usePoint(int amount) throws Exception {
		if (balancePoint < amount) {
			throw new Exception("point shortage");
		}
		balancePoint -= amount;
	}

	// confirm if pin is valid
	public boolean isCorrectCode(int pin) {
		return personalCode == pin;
	}

}
