package lec1101util;

public class Circle {

	//円の開始点のx座標
	protected int xPosition;
	//円の開始点のy座標
	protected int yPosition;
	//円の直径
	protected int diameter;

	//フィールドを初期化するメソッド
	public void setCircle(int x, int y, int d) {
		xPosition = x;
		yPosition = y;
		diameter = d;
	}

	//円の開始点のx座標を返すメソッド
	public int getX() {
		return xPosition;
	}

	//円の開始点のy座標を返すメソッド
	public int getY() {
		return yPosition;
	}

	//円の直径を返すメソッド
	public int getDiameter() {
		return diameter;
	}

}
