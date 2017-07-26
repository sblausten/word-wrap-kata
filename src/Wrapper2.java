
public class Wrapper2 {

	public static String wrap(String text, int cols) {
		if (cols >= text.length()) return text;
		int colsToSpace = text.substring(0, cols).lastIndexOf(' ');
		int actualCols = colsToSpace == -1 ? cols : colsToSpace + 1;
		if (text.charAt(cols) == ' ') actualCols = cols + 1;
		return (text.substring(0, actualCols) + "\n" + Wrapper2.wrap(text.substring(actualCols), cols));
	}
	
}
