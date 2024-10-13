import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ExitShop extends GameButton implements ActionListener {
	
	ExitShop(GamePanel panel) {
		super(panel);
		width = 100;
		height = 59;
		name = "shop.png";
		addActionListener(this);
		setup();
		draw();
	}

	public void update() {

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if(arg0.getSource() == buttonPressed) {
			panel.backdrop = 0;
			panel.drawGameState();
		}

	}
}
