import java.awt.Dimension;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class GameButton extends JButton {
	int width;
	int height;
	String name;
	Image image;
	GameButton() {
		
	}

	public void setup() {
		setOpaque(false);
		setFocusPainted(false);
		setBorderPainted(false);
		setContentAreaFilled(false);
		setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		setPreferredSize(new Dimension(width, height));
	}

	public void draw() {
		try {
			image = ImageIO.read(getClass().getResource(name));
			setIcon(new ImageIcon(image));

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
