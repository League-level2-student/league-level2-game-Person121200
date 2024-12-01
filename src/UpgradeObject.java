import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UpgradeObject extends JButton{
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
		setSize(50, 50);
		upgradeText = new JLabel(upgradeName + "\n" + price);
		add(upgradeIcon);
		add(upgradeText);

		
	}
	public void draw() {
		upgradeIcon.draw();
	}
	
}
