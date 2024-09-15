import java.awt.Button;
import java.awt.Dimension;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Cookie extends JButton{
	public ImageIcon image;
	public boolean needImage = true;
	public boolean gotImage = false;
	ImageIcon cookiePng;
	int width;
	int height;
	Cookie(int width, int height) {
		
		this.width = width;
		this.height = height;
		cookiePng = new ImageIcon("Cookie.png");
		if(cookiePng == null) {
			System.out.println("null");
		}
		setIcon(cookiePng);
		update();
	}
	public void update() {
		setPreferredSize(new Dimension(width, height));
	}
	

	
}

