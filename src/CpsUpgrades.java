import java.awt.event.ActionEvent;
import java.util.TimerTask;

import java.util.Timer;
public class CpsUpgrades extends UpgradeObject {
	Timer timer;
	TimerTask task;
	int cps;
	CpsUpgrades(String name, String upgradeName, int price, int multiplier, int cps) {
		super(name, upgradeName, price, multiplier);
		this.cps = cps;
		tick();
	}

	public void change() {
		price = price * multiplier;
		this.cps += cps;
	}

	public void tick() {
		task = new TimerTask() {
			public void run() {
				Cookie.score+=cps;
				System.out.println("anyword");
			}
		};
		timer = new Timer();
		
	}
	public void actionPerformed(ActionEvent arg0) {
		if (this == arg0.getSource()) {
			timer.scheduleAtFixedRate(task, 0, 1000);
			if (Cookie.score >= price) {
				subtractPrice();
				change();
				update();
				GamePanel.currentPanel.drawGameState();

			}

		}
		

	}


}
