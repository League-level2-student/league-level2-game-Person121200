import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ObjectManager extends JButton{
	Image cookiePng;
	int width;
	int height;
	ArrayList <JButton> cookies = new ArrayList();
	ArrayList <JButton> shop = new ArrayList();
	ObjectManager(int width, int height) {
		
		this.width = width;
		this.height = height;
		
		update();
	}

	public void update() {
		
		try {
			cookiePng = ImageIO.read(getClass().getResource("Cookie.png"));
			setIcon(new ImageIcon(cookiePng));
		
		}catch (Exception ex) {
			System.out.println(ex);
		}
	
	}
}
