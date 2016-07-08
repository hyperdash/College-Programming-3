/*MySquare.java*/
package mysquareUtil;

import java.awt.*;

public class MySquare {
	//フィールド
	//一辺の長さ
	protected int sideLength;

	//メソッド
	//コンストラクタ(引数あり)
	public MySquare(int l) {
		sideLength = l;
	}

	//コンストラクタ(引数なし)
	//※sideLengthを10で初期化する
	public MySquare() {
		this(10);
	}

	//一辺の長さを取得する
	public int getSideLength() {
		return sideLength;
	}

	//四角形を描画する
	public void draw(int x, int y, Graphics g) {
		g.drawRect(x, y, sideLength, sideLength);
	}
}