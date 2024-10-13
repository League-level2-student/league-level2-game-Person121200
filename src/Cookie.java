import java.awt.Button;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Cookie extends GameButton implements ActionListener {
	public static int score;

	Cookie(GamePanel panel) {
		super(panel);
		score = 0;
		width = 400;
		height = 361;
		name = "Cookie.png";
		addActionListener(this);
		setup();
		draw();
	}

	public void update() {
		panel.update();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if (arg0.getSource() == buttonPressed) {
			score += 1;
			update();
		}
	}
}
