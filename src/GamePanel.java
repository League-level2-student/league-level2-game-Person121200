import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.Border;

public class GamePanel implements ActionListener {
	public static GamePanel currentPanel;
	JFrame frame;
	JPanel cookiePanel;
	JPanel bottom;
	JPanel labels;
	ArrayList <UpgradeObject> allUpgrades = new ArrayList<>(); 
	JLabel scores;
	JPanel shopHolder;
	JLabel totalcps;
	JPanel topShop;
	JPanel centralShop;
	JPanel bottomShop;
	CpsUpgrades grandma;
	JLabel shopText;
	UpgradeObject cursor;
	int backdrop;
	JPanel cookieHolder;
	int cookieX;
	JPanel cursorPanel;
	int cookieY;
	Cookie cookie;
	ExitShop exitShop;
	EnterShop shop;

	GamePanel() {
		currentPanel = this;
		setUp();
	}

	public void setUp() {
		// Shop Stuff
		//centralshop = where all ugrades(buttons) are
		frame = new JFrame("Cookie Clicker");
		cursor = new CursorX2("Cursor.png","cursor", 1, 4);
		grandma = new CpsUpgrades("Grandma.png", "grandma", 10, 1.4, 10);
		allUpgrades.add(grandma);
		allUpgrades.add(cursor);
		shopHolder = new JPanel();
		topShop = new JPanel();
		centralShop = new JPanel();
		centralShop.add(cursor);
		centralShop.add(grandma);


		bottomShop = new JPanel();
		totalcps = new JLabel();
		shopText = new JLabel("Shop");
		exitShop = new ExitShop(this);
		bottomShop.add(exitShop);
		shopHolder.setBackground(Color.CYAN);
		topShop.setBackground(Color.CYAN);
		centralShop.setBackground(Color.CYAN);
		bottomShop.setBackground(Color.CYAN);
		shopText.setFont(new Font("Arial", Font.PLAIN, 24));
		
		
		shopHolder.setLayout(new BoxLayout(shopHolder, BoxLayout.Y_AXIS));
		
		topShop.add(shopText);
		shopHolder.add(topShop);
		shopHolder.add(centralShop);
		shopHolder.add(bottomShop);

		// CookieStuff
		cookiePanel = new JPanel();
		cookieHolder = new JPanel();
		bottom = new JPanel();
		labels = new JPanel();
		cookie = new Cookie(this);
		scores = new JLabel("Cookies: " + Cookie.score);
		shop = new EnterShop(this);
		scores.setFont(new Font("skibdi", Font.PLAIN, 36));
		totalcps.setFont(new Font("Arial", Font.PLAIN, 20));
		cookieHolder.setBackground(Color.CYAN);
		cookiePanel.setBackground(Color.CYAN);
		labels.setBackground(Color.CYAN);
		bottom.setBackground(Color.CYAN);
		cookiePanel.add(cookie);
		bottom.add(shop);
		labels.add(totalcps);
		labels.add(scores);
		cookieHolder.setLayout(new BoxLayout(cookieHolder, BoxLayout.Y_AXIS));
		cookieHolder.add(cookiePanel);
		cookieHolder.add(labels);
		cookieHolder.add(bottom);
		frame.add(cookieHolder);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(Runner.WIDTH, Runner.HEIGHT);
		frame.setVisible(true);

	}

	public void drawGameState() {
		if(backdrop ==0) {
			drawCookiePanel();
			SwingUtilities.updateComponentTreeUI(frame);

		}
		if(backdrop == 1) {
			drawShopPanel();
			SwingUtilities.updateComponentTreeUI(frame);

		}
		for(int i = 0; i< allUpgrades.size(); i++) {
			allUpgrades.get(i).draw();
		}
		

	}

	public void drawShopPanel() {
		frame.remove(cookieHolder);
		frame.add(shopHolder);
	}
	public void drawCookiePanel() {
		frame.remove(shopHolder);
		frame.add(cookieHolder);
	}

	public void update() {
		if(scores != null) {
			scores.setText("Cookies: " + Cookie.score);
		}
		if(totalcps != null) {
			totalcps.setText("Total CPS: " + Cookie.cps);

		}
	


	}


	@Override
	public void actionPerformed(ActionEvent arg0) {

	}

}
