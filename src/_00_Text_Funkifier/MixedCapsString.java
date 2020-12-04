package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		char newLetter = 0;
		String funkifiedString = "";
		for(int i = 0; i<=s.length()-1; i++) {
			if(i%2==1) {
				newLetter = Character.toUpperCase(s.charAt(i));
			}
			if(i%2==0) {
				newLetter = Character.toLowerCase(s.charAt(i));
			}
			funkifiedString = funkifiedString+newLetter;
			System.out.println(funkifiedString);
		}
		return funkifiedString;
	}

}
