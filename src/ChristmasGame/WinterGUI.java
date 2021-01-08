package ChristmasGame;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WinterGUI {
	JFrame frame = new JFrame();
	WinterPanel winterPanel = new WinterPanel();
	static int width = 825;
	static int height = 549;
	
	void setup() {
		frame.add(winterPanel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(width,height));
		frame.addKeyListener(winterPanel);
		frame.pack();
	}
}
