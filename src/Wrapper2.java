
public class Wrapper2 {

	public static String wrap(String text, int cols) {
		int length = text.length();
		if (cols >= length) { return text; }
		return (text.substring(0, cols) + "\n" + Wrapper2.wrap(text.substring(cols, length), cols));
	  
	}

}
