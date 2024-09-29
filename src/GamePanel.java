import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.Border;
public class GamePanel implements ActionListener{
	JFrame frame;
	JPanel panel;
	int cookieX;
	int cookieY;
	Cookie cookie;
	int score = 0;
	int change = 0;
	
	GamePanel(){

		setUp();
	}
	public void setUp() {
		frame = new JFrame();
		panel = new JPanel();
		cookie = new Cookie();
//		cookie.addActionListener(this);

		panel.add(cookie);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(Runner.WIDTH, Runner.HEIGHT);
		frame.setVisible(true);
	}
	public void drawGameState() {
		
	}

	public void update() {
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
	
	
}
