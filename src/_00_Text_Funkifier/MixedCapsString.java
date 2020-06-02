package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String word = "";
		for (int i = 0; i < s.length(); i++) {
			if(i%2==0) {
				word = word+Character.toLowerCase(s.charAt(i));
			} else {
				word = word+Character.toUpperCase(s.charAt(i));
			}
		}
		return word;
	}

}
