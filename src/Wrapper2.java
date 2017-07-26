
public class Wrapper2 {

	public static String wrap(String text, int cols) {
		int length = text.length();
		if (cols >= length) { return text; }
		String initialSection = text.substring(0, cols);
		int actualCols = initialSection.lastIndexOf(' ');
		if(actualCols == -1) actualCols = cols;
		return (text.substring(0, actualCols) + "\n" + Wrapper2.wrap(text.substring(actualCols, length), cols));
	}

}
