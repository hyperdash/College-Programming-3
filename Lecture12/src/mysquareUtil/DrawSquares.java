/*DrawSquares.java*/
package mysquareUtil;

import java.awt.*;

public class DrawSquares {

	//フィールド
	//MySquareクラスを参照する
	protected MySquare sq;
	//描画する四角形の横方向の個数
	protected int m;
	//描画する四角形の縦方向の個数
	protected int n;

	//メソッド
	//コンストラクタ(引数あり)
	public DrawSquares(MySquare sq, int m, int n) {
		this.sq = sq;
		this.m = m;
		this.n = n;
	}

	//コンストラクタ(引数なし)
	public DrawSquares() {
		this.sq = null;
	}

	//5x5個のMySquareクラスの四角形を描画する
	public void draw(Graphics g) {
		//もしsqがnullなら何もしない
		if (sq == null) return;
		//mxn個の四角形を描画する
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				//四角形と四角形の間にsideLengthの10分の1の隙間を空ける
				int x = (int) (10 + sq.getSideLength() * (1 + 1.1 * i));
				int y = (int) (10 + sq.getSideLength() * (1 + 1.1 * j));
				//MySquareクラスのdrawメソッドで
				//(x, y)の位置に四角形を描画する
				sq.draw(x, y, g);
			}
		}
	}
}