package ChristmasGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class WinterPanel extends JPanel implements KeyListener{
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;
	Avatar avatar = new Avatar();
	
	WinterPanel() {
		if(needImage) {
		loadImage("WinterBackground.jpg");
		}
		repaint();
		addKeyListener(this);
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

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		avatar.move(e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
