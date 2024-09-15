import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GamePanel{
	JFrame frame;
	JPanel panel;
	int cookieX;
	int cookieY;
	Cookie cookie;
	GamePanel(){

		setUp();
	}
	public void setUp() {
		frame = new JFrame();
		panel = new JPanel();
		cookie = new Cookie(300, 300);
		
		panel.add(cookie);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(Runner.WIDTH, Runner.HEIGHT);
		frame.setVisible(true);
	}
	public void update() {
		
	}
	
	
}
