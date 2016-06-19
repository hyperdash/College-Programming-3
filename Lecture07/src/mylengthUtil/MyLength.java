package mylengthUtil;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 6/20/16.
 */
public class MyLength {

	// fields
	private int feet;
	private int inch;

	// set values
	public void setLength(int ft, int in) {
		this.feet = ft;
		setLength(in);
	}

	// overloaded method
	public void setLength(MyLength x) {
		setLength(x.getFeet(), x.getInch());
	}

	// overloaded method
	public void setLength(int in) {
		if (in < 12) {
			this.inch = in;
		} else {
			int additional = in / 12;
			this.feet += additional;
			this.inch = in % 12;
		}
	}

	// add lengths and return new one stores the sum
	public MyLength add(MyLength x) {
		MyLength y = new MyLength();
		y.setLength(this.feet + x.getFeet(), this.inch + x.getInch());
		return y;
	}

	// overloaded method
	public MyLength add(int ft, int in) {
		MyLength x = new MyLength();
		x.setLength(ft, in);
		return add(x);
	}

	// overloaded method
	public MyLength add(int in) {
		MyLength x = new MyLength();
		x.setLength(in);
		return add(x);
	}

	// getters
	public int getFeet() {
		return feet;
	}

	public int getInch() {
		return inch;
	}

}
