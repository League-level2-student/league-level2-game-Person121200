import javax.swing.JPanel;

public class UpgradeObject extends JPanel{
	JPanel buttonPanel;
	UpgradeButton upgradeButton;
	UpgradeIcon upgradeIcon;
	String name;
	int price;
	UpgradeObject(String name, int price){
		this.name = name;
		this.price = price;
		buttonPanel = new JPanel();
		upgradeButton = new UpgradeButton(name, price);
		upgradeIcon = new UpgradeIcon(name);
		buttonPanel.add(upgradeButton);
		buttonPanel.add(upgradeIcon);
		
		
	}
}
