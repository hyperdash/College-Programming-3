package lec0902util;

/**
 * @author kosaka_kazuhiro@cyberagent.co.jp
 *         Created on 7/6/16.
 */
public class MyStudent {

	// field definitions
	private String name;
	private int schoolRegisterNumber;
	private int age;
	private MyStudent next;

	// methods

	// default constructor
	public MyStudent(String name, int schoolRegisterNumber, int age) {
		this.name = name;
		this.schoolRegisterNumber = schoolRegisterNumber;
		this.age = age;
	}

	// sub constructor
	public MyStudent(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getter methods
	public String getName() {
		return name;
	}
	public int getSchoolRegisterNumber() {
		return schoolRegisterNumber;
	}
	public int getAge() {
		return age;
	}
	public MyStudent getNext() {
		return next;
	}

	// setter method
	public void setNext(MyStudent next) {
		this.next = next;
	}

}
