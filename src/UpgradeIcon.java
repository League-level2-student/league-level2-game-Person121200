import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UpgradeIcon extends JLabel{
	String name;
	Image image;
	
	UpgradeIcon(String hi){
		
		
	}
	public void draw() {
		try {
			new ImageIcon(ImageIO.read(getClass().getResource("CursorHand")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
