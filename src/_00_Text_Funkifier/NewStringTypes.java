package _00_Text_Funkifier;

import java.util.HashMap;
import java.util.Random;

public class NewStringTypes extends SpecialString {
	HashMap<Character, Character> map = new HashMap<Character, Character>();
	public NewStringTypes(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		String newString = "";
		char letter = 0;
		Random r = new Random();
		if(map==null) {
			map = new HashMap<Character, Character>();
		}
		for(int i = 0; i<26;i++) {
			char randChar = (char)(r.nextInt(26)+(int)'a');
			letter = (char) ('a' + i);
			this.map.put(letter, randChar);
			System.out.println(letter);
		}
		
		for(int i = 0; i<s.length(); i++) {
			char currentChar = s.charAt(i);
			if(currentChar>='a'&&currentChar<='z')
			newString+=this.map.get(currentChar);
		else {
			newString+=currentChar;
		}
		}
		System.out.println(map);
		return newString;
	}
	
	HashMap getMap() {
		
		return this.map;
		
	}

}
