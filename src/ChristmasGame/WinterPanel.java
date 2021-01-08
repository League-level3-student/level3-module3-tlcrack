package ChristmasGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class WinterPanel extends JPanel implements KeyListener, ActionListener{
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;
	Avatar avatar = new Avatar();
	Snowball snowball = new Snowball();
	Timer snowfallTimer = new Timer(1000, this);
	ArrayList<Snowball> snowballs = new ArrayList<>();
	
	WinterPanel() {
		if(needImage) {
		loadImage("WinterBackground.jpg");
		}
		snowfallTimer.start();
		repaint();
	}
	
	void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		    gotImage = true;
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
	}
	
	protected void paintComponent(Graphics g){
		if (gotImage) {
			g.drawImage(image, 0, 0, WinterGUI.width, WinterGUI.height, null);
		} else {
			g.setColor(Color.BLUE);
			g.fillRect(0, 0, WinterGUI.width, WinterGUI.height);
		}
		avatar.draw(g);
	}
	
	void addSnowball() {
		snowballs.add(new Snowball());
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		avatar.move(e);
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==snowfallTimer) {
			
		}
	}
}
