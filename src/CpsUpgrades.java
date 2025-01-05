import java.awt.event.ActionEvent;

import javax.swing.Timer;

public class CpsUpgrades extends UpgradeObject {
	Timer timer;
	int cps;
	CpsUpgrades(String name, String upgradeName, int price, int multiplier, int cps) {
		super(name, upgradeName, price, multiplier);
		this.cps = cps;
	}

	public void change() {
		price = price * multiplier;
		Cookie.cps += cps;
	}
	public void tick() {
		timer = new Timer(1000, this);
		
		
	}
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
