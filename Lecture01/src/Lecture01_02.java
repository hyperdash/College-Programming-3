import java.applet.Applet;
import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 6/15/16.
 */
public class Lecture01_02 extends Applet implements TextListener {

	// define text fields
	private TextField left, right;

	public void init() {
		// instantiate left text field
		left = new TextField("", 20);

		// add text listener to left
		left.addTextListener(this);

		// show left
		add(left);

		// instantiate right text field
		right = new TextField("", 20);

		// show right
		add(right);
	}

	@Override
	public void textValueChanged(TextEvent e) {
		// update right text
		right.setText(left.getText().toLowerCase());
	}

}
