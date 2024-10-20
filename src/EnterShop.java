import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EnterShop extends GameButton implements ActionListener {

	EnterShop(GamePanel panel) {
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
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (e.getSource() == buttonPressed) {
			panel.backdrop=1;
			panel.drawGameState();
			
		}
	}

}
