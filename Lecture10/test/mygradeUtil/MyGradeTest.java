package mygradeUtil;

import junit.framework.TestCase;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 7/7/16.
 */
public class MyGradeTest extends TestCase {

	public void testSet() throws Exception {
		MyGrade myGrade = new MyGrade();

		// score: below 0, attendance: below 0
		myGrade.set(-1, -1);
		assertEquals("should be 0", 0, myGrade.getScore());
		assertEquals("should be 0", 0, myGrade.getAttendance());

		// score: 0 - 100, attendance: 0 - 14
		myGrade.set(50, 7);
		assertEquals("should be 50", 50, myGrade.getScore());
		assertEquals("should be 7", 7, myGrade.getAttendance());

		// score: above 100, attendance: above 14
		myGrade.set(101, 15);
		assertEquals("should be 0", 0, myGrade.getScore());
		assertEquals("should be 0", 0, myGrade.getAttendance());
	}

	public void testGetScore() throws Exception {
		MyGrade myGrade = new MyGrade();

		// score: 1
		myGrade.set(1, 0);
		assertEquals("should be 1", 1, myGrade.getScore());
	}

	public void testGetAttendance() throws Exception {
		MyGrade myGrade = new MyGrade();

		// attendance: 1
		myGrade.set(0, 1);
		assertEquals("should be 1", 1, myGrade.getAttendance());
	}

	public void testHasPassed() throws Exception {
		MyGrade myGrade = new MyGrade();

		// score: < 60, attendance: 11
		myGrade.set(59, 11);
		assertEquals(false, myGrade.hasPassed());

		// score: < 60, attendance: 12
		myGrade.set(59, 12);
		assertEquals(false, myGrade.hasPassed());

		// score: >= 60, attendance: 11
		myGrade.set(60, 11);
		assertEquals(false, myGrade.hasPassed());

		// score: >= 60, attendance: 12
		myGrade.set(60, 12);
		assertEquals(true, myGrade.hasPassed());
	}

	public void testIsEligible() throws Exception {
		MyGrade myGrade = new MyGrade();

		// attendance: 11
		myGrade.set(0, 11);
		assertEquals(false, myGrade.isEligible());

		// attendance: 12
		myGrade.set(0, 12);
		assertEquals(true, myGrade.isEligible());
	}

}
