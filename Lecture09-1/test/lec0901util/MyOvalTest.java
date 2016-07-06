package lec0901util;

import junit.framework.TestCase;

public class MyOvalTest extends TestCase {

	public void testMyOvalintintintintintint() {
		MyOval o = new MyOval( 10, 20, 30, 0, 125, 255);
		assertEquals("xPositionは10のはず", 10, o.getX());
		assertEquals("yPositionは20のはず", 20, o.getY());
		assertEquals("widthは30のはず", 30, o.getR());
		assertEquals("colorRedは0のはず", 0, o.getRed());
		assertEquals("colorGreenは125のはず", 125, o.getGreen());
		assertEquals("colorBlueは255のはず", 255, o.getBlue());
	}

	public void testMyOvalintintint() {
		MyOval o = new MyOval( 10, 20, 30);
		assertEquals("xPositionは10のはず", 10, o.getX());
		assertEquals("yPositionは20のはず", 20, o.getY());
		assertEquals("widthは30のはず", 30, o.getR());
		assertEquals("colorRedは0のはず", 0, o.getRed());
		assertEquals("colorGreenは0のはず", 0, o.getGreen());
		assertEquals("colorBlueは255のはず", 255, o.getBlue());
	}

	public void testGetX() {
		MyOval o = new MyOval( 10, 20, 30, 0, 125, 255);
		assertEquals("xPositionは10のはず", 10, o.getX());
	}

	public void testGetY() {
		MyOval o = new MyOval( 10, 20, 30, 0, 125, 255);
		assertEquals("yPositionは20のはず", 20, o.getY());
	}

	public void testGetR() {
		MyOval o = new MyOval( 10, 20, 30, 0, 125, 255);
		assertEquals("radiusは30のはず", 30, o.getR());	}

	public void testGetRed() {
		MyOval o = new MyOval( 10, 20, 30, 0, 125, 255);
		assertEquals("colorRedは0のはず", 0, o.getRed());
	}

	public void testGetGreen() {
		MyOval o = new MyOval( 10, 20, 30, 0, 125, 255);
		assertEquals("colorGreenは125のはず", 125, o.getGreen());
	}

	public void testGetBlue() {
		MyOval o = new MyOval( 10, 20, 30, 0, 125, 255);
		assertEquals("colorBlueは255のはず", 255, o.getBlue());
	}

	public void testSetRed() {
		MyOval o = new MyOval( 10, 20, 30, 0, 125, 255);
		o.setRed(100);
		assertEquals("colorRedは100のはず", 100, o.getRed());
	}

	public void testSetGreen() {
		MyOval o = new MyOval( 10, 20, 30, 0, 125, 255);
		o.setGreen(100);
		assertEquals("colorGreenは100のはず", 100, o.getGreen());
	}

	public void testSetBlue() {
		MyOval o = new MyOval( 10, 20, 30, 0, 125, 255);
		o.setBlue(100);
		assertEquals("colorBlueは100のはず", 100, o.getBlue());
	}

	public void testIsCollision() {
		MyOval o = new MyOval( 10, 20, 30, 0, 125, 255);
		MyOval o1 = new MyOval( 20, 30, 30, 125, 125, 255);
		MyOval o2 = new MyOval( 110, 120, 30, 255, 255, 255);
		assertTrue("o1とoは衝突するはず", o1.isCollision(o));
		assertFalse("o2とoは衝突しないはず", o2.isCollision(o));
	}
}