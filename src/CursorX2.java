import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.BoxLayout;
import javax.swing.JLabel;

public class CursorX2 extends UpgradeObject {

	CursorX2(String name, String upgradeName, int price, int multiplier) {
		super(name, upgradeName, price, multiplier);

	}

	public void change() {
		price = price * multiplier;
		Cookie.change = Cookie.change * 2;

	}
}
