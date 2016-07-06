package lec0902util;

import junit.framework.TestCase;

public class MyStudentTest extends TestCase{
	public void testMyStudentStringintint() {
		MyStudent s = new MyStudent("阿笠田奈", 123456, 12);
		assertEquals("氏名は阿笠田奈", "阿笠田奈", s.getName());
		assertEquals("学籍番号は123456のはず", 123456,s.getSchoolRegisterNumber());
		assertEquals("年齢は12のはず", 12, s.getAge());
		assertEquals("nextはnullのはず", null, s.getNext());
	}

	public void testMyStudentStringint() {
		MyStudent s = new MyStudent("阿笠田奈", 123456, 12);
		assertEquals("氏名は阿笠田奈", "阿笠田奈", s.getName());
		assertEquals("年齢は12のはず", 12, s.getAge());
		assertEquals("nextはnullのはず", null, s.getNext());
	}

	public void testGetName() {
		MyStudent s = new MyStudent("阿笠田奈", 123456, 12);
		assertEquals("氏名は阿笠田奈", "阿笠田奈", s.getName());
	}

	public void testGetSchoolRegisterNumber() {
		MyStudent s = new MyStudent("阿笠田奈", 123456, 12);
		assertEquals("学籍番号は123456のはず", 123456,s.getSchoolRegisterNumber());

	}

	public void testGetAge() {
		MyStudent s = new MyStudent("阿笠田奈", 123456, 12);
		assertEquals("年齢は12のはず", 12, s.getAge());
	}

	public void testSetNext() {
		MyStudent s1 = new MyStudent("阿笠田奈", 123456, 12);
		MyStudent s2 = new MyStudent("山田太郎", 123678, 34);
		s1.setNext(s2);  //s2はs1の次の要素
		assertEquals("s1のnextはs2のはず", s2, s1.getNext());
	}

	public void testGetNext() {
		MyStudent s1 = new MyStudent("阿笠田奈", 123456, 12);
		MyStudent s2 = new MyStudent("山田太郎", 123678, 34);
		s1.setNext(s2);  //s2はs1の次の要素
		assertEquals("s1のnextはs2のはず", s2, s1.getNext());
	}
}