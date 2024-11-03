import java.awt.Image;
import java.awt.Panel;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UpgradeButton extends GameButton{
	UpgradeButton(GamePanel panel, String text, int price) {
		super(panel);
		width = 90;
		height = 66;
		name = "buttonOutline";

		
	}
	

	public void update(){
		
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
