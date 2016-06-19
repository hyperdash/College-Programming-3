/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 6/19/16.
 */
public class MyVolume {

	// fields
	private int to = 0;
	private int syou = 0;
	private int gou = 0;

	// set volume
	public void setVolume(int t, int s, int g) {
		this.to = t;
		this.syou = s;
		this.gou = g;
	}

	// getter for to
	public int getTo() {
		return to;
	}

	// getter for syou
	public int getSyou() {
		return syou;
	}

	// getter for gou
	public int getGou() {
		return gou;
	}

	// add volume and return new one stores the sum
	public MyVolume add(MyVolume x) {
		MyVolume y = new MyVolume();
		y.setVolume(this.to + x.to, this.syou + x.syou, this.gou + x.gou);
		return y;
	}

}
