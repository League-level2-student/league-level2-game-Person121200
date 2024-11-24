import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UpgradeButton extends GameButton implements ActionListener{
	UpgradeButton(String text, int price) {
		super();

		width = 500;
		height = 500;
		name = "buttonOutline.png";
		setText(text + "\n" + price);
		addActionListener(this);
		setLayout(null);
		setup();
		draw();

		
	}
	

	public void update(){
		
	}
//	public void draw() {
//		super.draw();
//		try {
//			image = ImageIO.read(getClass().getResource(name));
//			setIcon(new ImageIcon(image));
//
//		} catch (Exception ex) {
//			System.out.println(ex);
//		}
//	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();		
		if(arg0.getSource() == buttonPressed) {
			
		}
	}

}
