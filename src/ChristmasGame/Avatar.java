package ChristmasGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Avatar extends GameObject{
	Avatar(){
		super();
	}
	
	void draw(Graphics g) {
		if (gotImage) {
			g.drawImage(image, x, y, width, height, null);
		} else {
			g.setColor(Color.BLUE);
			g.fillRect(x, y, width, height);
		}
		
	}
	void move(KeyEvent e) {
		if(e.getSource().equals(KeyEvent.VK_W)) {
			y-=speed;
		}
		if(e.getSource().equals(KeyEvent.VK_S)) {
			y+=speed;
		}
		if(e.getSource().equals(KeyEvent.VK_A)) {
			x-=speed;
		}
		if(e.getSource().equals(KeyEvent.VK_D)) {
			x+=speed;
		}
	}
}
