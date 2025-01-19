import java.awt.event.ActionEvent;
import java.util.TimerTask;

import javax.swing.SwingUtilities;

import java.util.Timer;
public class CpsUpgrades extends UpgradeObject {
	Timer timer;
	TimerTask task;
	double totalcps = 0;
	double cps;
	
	CpsUpgrades(String name, String upgradeName, int price, double multiplier, int cps) {
		super(name, upgradeName, price, multiplier);
		this.cps = cps;
		startTimer();
		
	}

	public void change() {
		price = price * multiplier;
		Cookie.cps += cps;
		totalcps+=cps;
	}

	public void startTimer() {
		task = new TimerTask() {
			public void run() {
				if(GamePanel.currentPanel != null) {
					Cookie.score+=totalcps;
					GamePanel.currentPanel.update();

				}

				System.out.println("anyword");


			}
		};
		timer = new Timer();
		timer.schedule(task, 0, 1000);

		
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
