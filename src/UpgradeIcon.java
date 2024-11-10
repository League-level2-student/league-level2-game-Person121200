import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UpgradeIcon extends JLabel{
	String name;
	Image image;
	
	UpgradeIcon(String name){
		this.name = name;
		
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
