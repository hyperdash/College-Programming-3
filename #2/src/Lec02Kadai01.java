import java.applet.Applet;
import java.awt.*;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 6/18/16.
 */
public class Lec02Kadai01 extends Applet {

	public void paint(Graphics g) {
		// 5人の学生の学習時間のデータ
		int h[] = {2, 4, 5, 1, 3};      // 時間のデータ
		int m[] = {23, 31, 54, 12, 42}; // 分 のデータ
		int s[] = {40, 21, 33, 10, 55}; // 秒 のデータ

		// MyTimeクラスのインスタンスを参照する変数 totalTimeを宣言する
		MyTime totalTime;

		// (1人目の和を求めるときtotalTime.add(t)を使うので，生成しておく)
		totalTime = new MyTime();

		// 5人分の学習時間を加えていく
		for (int i = 0; i < 5; i++) {
			// MyTimeクラスのインスタンスを参照する変数 t を宣言し，
			// MyTimeクラスのインスタンスを生成して代入する
			MyTime t = new MyTime();

			// MyTimeクラスのインスタンスtに，i番目の学生の学習時間を設定する
			t.setTime(h[i], m[i], s[i]);  // ←空白を埋める

			// 時間の和 totalTime + t を求めて，totalTimeに代入する
			totalTime = totalTime.add(t);
		}

		//MyTimeクラスのインスタンスを参照する変数averageTimeを宣言し、
		//MyTimeクラスのインスタンスを生成して代入する
		MyTime averageTime = new MyTime();

		//時間の合計totalTimeを学生の数で割って、averageTimeに代入する
		averageTime.setTime(totalTime.getHour() / 5, totalTime.getMinute() / 5, totalTime.getSecond() / 5);

		// 平均学習時間を表示する
		g.drawString("平均学習時間=" + averageTime.getHour() + "時間 "
				+ averageTime.getMinute() + "分 "
				+ averageTime.getSecond() + "秒", 30, 30);
	}

}
