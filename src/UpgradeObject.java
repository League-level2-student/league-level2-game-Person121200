import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class UpgradeObject extends JButton implements ActionListener {
	JLabel upgradeText;
	UpgradeIcon upgradeIcon;
	String name;
	String upgradeName;
	double price;
	double multiplier;

	UpgradeObject(String name, String upgradeName, double price, double multiplier){
		this.name = name;
		this.price = price;
		this.multiplier = multiplier;
		this.upgradeName = upgradeName;
		upgradeIcon = new UpgradeIcon(name);
		upgradeText = new JLabel(upgradeName + "\n" + price);
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		addActionListener(this);
		add(upgradeIcon);
		add(upgradeText);

		
	}

	public void draw() {
		if (Cookie.score < price) {
			setBackground(Color.RED);
			setOpaque(true);

		} else {
			setBackground(Color.GREEN);
			setOpaque(true);
		}

		upgradeIcon.draw();

	}

	public void subtractPrice() {
		Cookie.score = Cookie.score - price;

	}

	public void update() {
		GamePanel.currentPanel.update();
		upgradeText.setText(upgradeName + "\n" + price);
	}

	public void change() {
		price = price * multiplier;

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (this == arg0.getSource()) {
			if (Cookie.score >= price) {
				subtractPrice();
				change();
				update();
				GamePanel.currentPanel.drawGameState();

			}

		}

	}
}

