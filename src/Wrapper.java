import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Wrapper {

	public static String wrap(String text, int columnLength) {
		int textLength = text.length();
		char[] charsArray = text.toCharArray();
		List<String> textSections = new ArrayList<String>();
		int sectionCount = textLength / columnLength;
		
		int charNum = 0;
		for (int i = 0; i < sectionCount; i++) {
			String section = "";
			for (int n = 0; n < columnLength; n++) {
				section += charsArray[charNum];
				charNum++;
			}
			textSections.add(section);
		}
		int remainingChars = textLength % columnLength;
		if(remainingChars > 0) {
			String section = "";
			for (int n = 0; n < remainingChars; n++) {
				section += charsArray[charNum];
				charNum++;
			}
			textSections.add(section);
		}
		return text.join("\n", textSections);
	}

}
