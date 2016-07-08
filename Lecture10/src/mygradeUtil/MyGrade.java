package mygradeUtil;

public class MyGrade {

	//フィールド
	//試験の得点
	private int score;
	//出席回数
	private int attendance;

	//メソッド
	//試験の得点と出席回数を設定
	public void set(int s, int a) {
		//試験の得点を設定
		//※100より大きい値や負の値は0点とする
		if (s > 100 || s < 0) {
			score = 0;
		} else {
			score = s;
		}
		//出席日数を設定
		//※14より大きい値や負の値は0回とする
		if (a > 14 || a < 0) {
			attendance = 0;
		} else {
			attendance = a;
		}
	}

	//試験の得点を取得する
	public int getScore() {
		return score;
	}

	//出席日数を取得する
	public int getAttendance() {
		return attendance;
	}

	//試験の合否を判定する
	public boolean hasPassed() {
		if (score >= 60 && isEligible()) {
			return true;
		} else {
			return false;
		}
	}

	//試験の受験資格があるかどうかを判定する
	//※8割以上出席で受験資格あり
	public boolean isEligible() {
		if ((attendance / 14.0) >= 0.8) {
			return true;
		} else {
			return false;
		}
	}
}
