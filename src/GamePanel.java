import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.Border;

public class GamePanel implements ActionListener {
	int score;
	JFrame frame;
	JPanel cookiePanel;
	JPanel bottom;
	JPanel labels;
	JLabel scores;
	JPanel holder;
	int cookieX;
	int cookieY;
	Cookie cookie;
	Shop shop;

	GamePanel() {

		setUp();
	}

	public void setUp() {
		drawGameState();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(Runner.WIDTH, Runner.HEIGHT);
		frame.setVisible(true);
	}

	public void drawGameState() {
		frame = new JFrame();
		cookiePanel = new JPanel();
		holder = new JPanel();
		bottom = new JPanel();
		labels = new JPanel();
		cookie = new Cookie();
		score = 0;
		scores = new JLabel("Cookies: "+score);
		shop = new Shop();
		scores.setFont(new Font("skibdi", Font.PLAIN, 24));
		holder.setBackground(Color.CYAN);
		cookiePanel.setBackground(Color.CYAN);
		labels.setBackground(Color.CYAN);
		bottom.setBackground(Color.CYAN);
		cookiePanel.add(cookie);
		bottom.add(shop);
		labels.add(scores);
		holder.setLayout(new BoxLayout(holder, BoxLayout.Y_AXIS));
		holder.add(cookiePanel);
		holder.add(labels);
		holder.add(bottom);
		frame.add(holder);
	}

	public void update() {

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}

}
