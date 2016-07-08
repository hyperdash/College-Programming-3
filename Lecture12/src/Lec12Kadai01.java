/*Lec12Kadai01.java*/

import mysquareUtil.DrawSquares;
import mysquareUtil.MySquare;

import java.applet.Applet;
import java.awt.*;

public class Lec12Kadai01 extends Applet {

	public void paint(Graphics g) {
		//MySquareクラスのインスタンスを生成
		MySquare sq = new MySquare(20);
		//DrawSquaresクラスのインスタンスを生成
		DrawSquares ds = new DrawSquares(sq, 5, 4);
		//5x4個の四角形を描画
		ds.draw(g);


		// instantiate MyInnerRect
		MyInnerRect is = new MyInnerRect(40, Color.red, 20, Color.blue);
		// instantiate DrawSquares
		DrawSquares ids = new DrawSquares(is, 5, 4);
		// draw 4 by 5 squares
		ids.draw(g);
	}

	private class MyInnerRect extends MySquare {

		// field definitions
		private int innerSideLength;
		private Color squareColor;
		private Color innerRectColor;

		/**
		 * Default Constructor
		 *
		 * @param sl
		 * @param sc
		 * @param irl
		 * @param irc
		 */
		public MyInnerRect(int sl, Color sc, int irl, Color irc) {
			sideLength = sl;
			squareColor = sc;
			innerSideLength = irl;
			innerRectColor = irc;

			if (innerSideLength > sideLength) {
				innerSideLength = sideLength;
			}
		}

		/**
		 * Sub Constructor
		 *
		 */
		public MyInnerRect() {
			super(20);
			this.squareColor = Color.yellow;
			this.innerSideLength = 10;
			this.innerRectColor = Color.green;
		}

		/**
		 * Draw squares
		 *
		 * @param x
		 * @param y
		 * @param g
		 */
		@Override
		public void draw(int x, int y, Graphics g) {
			// draw outer rect
			g.setColor(squareColor);
			g.fillRect(x, y, sideLength, sideLength);

			// draw inner rect
			g.setColor(innerRectColor);
			int margin = (sideLength - innerSideLength) / 2;
			g.fillRect(x + margin, y + margin, innerSideLength, innerSideLength);
		}

	}

}

//(1)MySquareクラスをスーパークラスとして，サブクラスMyInnerRectを次の仕様のとおりに作成しなさい． MyInnerRectクラスは，Lec12Kadai01.javaファイルに作成しなさい．
//
//
//		○仕様
//
//		MyInnerRectクラスには，外側の四角形の色と内側の四角形の色を記憶する次のフィールドを追加しなさい．
//		型	変数名	役割
//		int	innerSideLength	内側の四角形の一辺の長さ
//		Color	squareColor	外側の四角形の色
//		Color	innerRectColor	内側の四角形の色
//
//		MyInnerRectクラスには，次のメソッドを追加し，drawメソッドをオーバーライドしなさい．
//		メソッド名	戻り値の型	引数	役割
//		(コンストラクタ)	指定しない	int sl,
//		Color sc,
//		int irl,
//		Color irc	sideLengthをslで， squareColorをscで，innerSideLengthをirlで, innerRectColor をircで初期化する．
//		※innerSideLength > sideLength のときは，innerSideLength に sideLength と同じ値を設定すること．

//		(コンストラクタ)	指定しない	なし	sideLengthを20, squareColorを黄色(Color.yellow), innerSideLengthを10, innerRectColorを緑(Color.green)で初期化する

//		draw	なし	int x,
//		int y,
//		Graphics g	x, yを左上の頂点として，図5のように，指定した色の2つの四角形が重なった図形を描画する．
//		※内側の四角形は外側の四角形の中心に描画する．
//
//
//
//		図5　2つの四角形が重なった図形
//
//
//		(2)Lec12Kadai01クラスのpaintメソッドで呼びだしているDrawSquaresクラスのdrawメソッドで, MyInnerRectクラスのdrawメソッドを使って描画するように(MySquareクラスのdrawメソッドをオーバーライドするように)しなさい． paintメソッドで修正が必要となるのは，次の２箇所です．
//
//		外側の四角形の一辺の長さ(sideLength)，外側の四角形の色(squareColor)，内側の四角形の一辺の長さ(innerSideLength)，内側の四角形の色(innerRectColor)は, MyInnerRectクラスのコンストラクタで与える．
//		DrawSquaresクラスのコンストラクタには，生成したMyInnerRectクラスのインスタンスとm, nの値を渡す．
//		　※MySquareクラスおよびDrawSquaresクラスは一切変更してはいけない．