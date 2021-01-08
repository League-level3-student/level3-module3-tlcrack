package ChristmasGame;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Snowball extends GameObject{
	Random snowRandomizer = new Random();
	
	
	Snowball(){
		super();
		width=59;
		height=60;
	}
	
	void draw(Graphics g) {
		if (gotImage) {
			g.drawImage(image, x, y, width, height, null);
		} else {
			g.setColor(Color.BLUE);
			g.fillRect(x, y, width, height);
		}
		
	}
	
	void snowballAppears() {
		int snowfallWidth = snowRandomizer.nextInt(766);
		int snowfallHeight = snowRandomizer.nextInt(489);
		
	}
	
}
