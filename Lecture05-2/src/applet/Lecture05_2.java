package applet;

import lec0501util.PointCardAccount;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 15T026en@stu.teikyo-u.ac.jp
 *         Created on 6/19/16.
 */
public class Lecture05_2 extends Applet implements ActionListener {

	// define point card
	private PointCardAccount card;


	// define the button to display the balance
	private Button balanceBtn;

	// define the button to add points
	private Button purchaseBtn;

	// define the button to subtract points
	private Button spendBtn;


	// define the text field to input pin
	private TextField pinText;

	// define the text field to input points
	private TextField amountText;

	// define the text field to display messages
	private TextField msgText;


	// message
	private String msg = "";


	// regex pattern
	private static Pattern P = Pattern.compile("[0-9]+"); // only numbers


	public void init() {
		// instantiate point card
		card = new PointCardAccount();
		card.initPointCardAccount("John Smith", 1234, 5678);

		// instantiate buttons
		balanceBtn = new Button("ポイント残高照会");
		balanceBtn.addActionListener(this);
		add(balanceBtn);

		purchaseBtn = new Button("ポイント購入");
		purchaseBtn.addActionListener(this);
		add(purchaseBtn);

		spendBtn = new Button("ポイント利用");
		spendBtn.addActionListener(this);
		add(spendBtn);

		// instantiate text fields
		pinText = new TextField("", 9);
		//pinText.addActionListener(this);
		add(pinText);

		amountText = new TextField("", 9);
		//amountText.addActionListener(this);
		add(amountText);

		msgText = new TextField("", 100);
		//msgText.addActionListener(this);
		add(msgText);

		// label for pin
		Label pinLabel = new Label("暗証番号");
		add(pinLabel);

		// label for point
		Label amountLabel = new Label("ポイント");
		add(amountLabel);

		// adjust positions
		setLayout(null);
		pinLabel.setBounds(30, 30, 60, 25);
		pinText.setBounds(95, 30, 100, 25);
		balanceBtn.setBounds(200, 30, 150, 25);
		purchaseBtn.setBounds(350, 30, 125, 25);
		spendBtn.setBounds(475, 30, 125, 25);
		amountText.setBounds(60, 70, 100, 25);
		amountLabel.setBounds(165, 70, 60, 25);
		msgText.setBounds(240, 70, 300, 25);
	}

	public void paint(Graphics g) {
		msgText.setText(msg);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// confirm pin contains only numbers
		Matcher m = P.matcher(pinText.getText());
		if (!m.matches()) {
			update("暗証番号入力値が不正です");
			return;
		}

		// validate pin
		if (!card.isCorrectCode(Integer.parseInt(pinText.getText()))) {
			update("暗証番号が違います");
			return;
		}

		// balanceBtn was pushed
		if (e.getSource() == balanceBtn) {
			update("ポイント残高は" + card.getBalancePoint() + "ポイントです");
			return;
		}

		// confirm amount contains only numbers
		m = P.matcher(amountText.getText());
		if (!m.matches()) {
			update("ポイント入力値が不正です");
			return;
		}

		// add points
		if (e.getSource() == purchaseBtn) {
			card.purchasePoint(Integer.parseInt(amountText.getText()));
			update("ポイント残高は" + card.getBalancePoint() + "ポイントです");
		}
		// subtract points
		else if (e.getSource() == spendBtn) {
			try {
				card.usePoint(Integer.parseInt(amountText.getText()));
				update("ポイント残高は" + card.getBalancePoint() + "ポイントです");
			} catch (Exception ex) {
				update("ポイント残高が不足しています");
			}
		}
	}

	/**
	 * Used commonly to display message.
	 */
	private void update(String msg) {
		this.msg = msg;
		repaint();
	}

}
