package ChristmasGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Avatar extends GameObject {
	Avatar(){
		super();
		x = 100;
		y = 100;
		width = 65;
		height = 128;
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
		String keyPressed=e.getKeyChar()+"";
		if(keyPressed.equalsIgnoreCase("w")&&y>0&&x>0) {
			x-=speed;
			y-=speed;
		}
		if(keyPressed.equalsIgnoreCase("s")&&y<371&&x<720) {
			x+=speed;
			y+=speed;
		}
		if(keyPressed.equalsIgnoreCase("a")&&y<371&&x>0) {
			x-=speed;
			y+=speed;
		}
		if(keyPressed.equalsIgnoreCase("d")&&y>0&&x<720) {
			y-=speed;
			x+=speed;
		}
	}
}
