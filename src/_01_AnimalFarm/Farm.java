package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
 public static void main(String[] args) {
	 
	ArrayList<Animal> farm = new ArrayList<Animal>();
	farm.add(new Horse("Bernie"));
	farm.add(new Horse("Jerry"));
	farm.add(new Chicken("Henry"));
	farm.add(new Cow("Glen"));
	farm.add(new Goat("John"));
	farm.add(new Goat("Clarence"));
	
	for(int i = 0; i<farm.size(); i++) {
		farm.get(i).makeNoise();
		farm.get(i).walk();
	}
}

}
