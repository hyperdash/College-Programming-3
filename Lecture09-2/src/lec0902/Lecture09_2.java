package lec0902;

import lec0902util.MyStudent;

import java.applet.Applet;
import java.awt.*;

/**
 * @author kosaka_kazuhiro@cyberagent.co.jp
 *         Created on 7/6/16.
 */
public class Lecture09_2 extends Applet {

	public void paint(Graphics g) {
		// instantiate root student
		MyStudent root = new MyStudent("root", 0, 1);

		// instantiate primary student
		MyStudent primary = new MyStudent("primary", 5);
		// set as the next of root
		root.setNext(primary);

		// instantiate secondary student
		MyStudent secondary = new MyStudent("secondary", 2, 3);
		// set as the next of primary
		primary.setNext(secondary);

		// search the olest student
		MyStudent current = root.getNext();
		MyStudent oldest = root;
		int maxAge = root.getAge();
		while (current != null) {
			if (current.getAge() > maxAge) {
				oldest = current;
				maxAge = oldest.getAge();
			}
			current = current.getNext();
		}

		System.out.println(oldest.getAge());

		// display info of the oldest student
		g.drawString("最高齢の学生 氏名: " + oldest.getName() +
				" 年齢: " + oldest.getAge(), 30, 30);

	}

}
