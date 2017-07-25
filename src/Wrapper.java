import java.util.ArrayList;

public class Wrapper {

	public static String wrap(String text, int columnLength) {
		int textLength = text.length();
		if(textLength < columnLength) return text;
		char[] charsArray = text.toCharArray();
		ArrayList<String> textSections = new ArrayList<String>();
		int sectionCount = textLength / columnLength;
		int charIndex = 0;
		
		for (int i = 0; i < sectionCount; i++) {
			String section = "";
			int lengthTillLastSpace = charIndex + columnLength;
			while (charsArray[lengthTillLastSpace] != ' ') {
				lengthTillLastSpace -= 1;
			}
			int charsInThisSection = lengthTillLastSpace - charIndex;
			for (int n = 0; n < charsInThisSection; n++) {
				section += charsArray[charIndex];
				charIndex++;
			}
			textSections.add(section.trim());
		}
		int remainingChars = textLength % charIndex;
		if(remainingChars > 0) {
			String section = "";
			for (int n = 0; n < remainingChars; n++) {
				section += charsArray[charIndex];
				charIndex++;
			}
			textSections.add(section.trim());
		}
		return text.join("\n", textSections);
	}

}
