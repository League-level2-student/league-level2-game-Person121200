import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class UpgradeObject extends JButton implements ActionListener{
	JLabel upgradeText;
	UpgradeIcon upgradeIcon;
	String name;
	String upgradeName;
	
	int price;
	UpgradeObject(String name, String upgradeName, int price){
		this.name = name;
		this.price = price;
		this.upgradeName = upgradeName;
		upgradeIcon = new UpgradeIcon(name);
		upgradeText = new JLabel(upgradeName + "\n" + price);
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

		add(upgradeIcon);
		add(upgradeText);

		
	}
	public void draw() {
		if(Cookie.score < price) {
			setBackground(Color.RED);
			setOpaque(true);
			removeActionListener(this);

			
		}
		else {
			setBackground(Color.GREEN);
			setOpaque(true);
		}

		upgradeIcon.draw();

	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed == arg0.getSource()) {
			
				Cookie.score=Cookie.score-price;
				Cookie.change = Cookie.change*2;
				price = price*4;
			}

			

//			if(Cookie.change >= 100000) {
//				upgradeText = new JLabel("MAXED OUT");
//				Cookie.change =Cookie.change*1;
			}
		}
	
	

