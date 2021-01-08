package ChristmasGame;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	int speed=50;
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;
	
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
	GameObject(){
		if(needImage) {
		loadImage("Avatar.png");
		}
		
	}
	
	
}
