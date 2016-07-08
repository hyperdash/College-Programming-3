package lec1101;

import lec1101util.Circle;
import lec1101util.ColorCircle;

import java.applet.Applet;
import java.awt.*;

public class Lec1101 extends Applet {

	public void paint(Graphics g) {
		//Circleクラスのオブジェクトc1の生成
		Circle c1 = new Circle();
		//オブジェクトc1の各フィールドの初期化
		c1.setCircle(10, 10, 50);
		//オブジェクトc1の各フィールドを用いて円を描く
		g.fillOval(c1.getX(), c1.getY(), c1.getDiameter(), c1.getDiameter());

		//ColorCircleクラスのオブジェクトc2の生成
		ColorCircle c2 = new ColorCircle();
		//オブジェクトc2の各フィールドの初期化
		c2.setColorCircle(60, 60, 40, 128, 128, 0);
		//オブジェクトc2の赤緑青の値を用いて色の設定
		g.setColor(new Color(c2.getColorRed(), c2.getColorGreen(), c2.getColorBlue()));
		//オブジェクトc2のx,yの開始座標，直径のフィールドを用いて円を描く
		g.fillOval(c2.getX(), c2.getY(), c2.getDiameter(), c2.getDiameter());
	}

}
