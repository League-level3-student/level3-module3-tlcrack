package _00_Text_Funkifier;

import java.util.Stack;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		Stack<Character> letterHolder = new Stack<Character>();
		for(int i = 0; i <= s.length()-1; i++) {
			letterHolder.push(s.charAt(i));
		}
		String backwardsString="";
		for(int i = 0; i <= s.length()-1; i++) {
			backwardsString=backwardsString+letterHolder.pop();
		}
		return backwardsString;
	}

}
