
public class Wrapper2 {

	public static String wrap(String text, int cols) {
		
		if (cols >= text.length()) { return text; }
		return (text.substring(0, cols) + "\n" + text.substring(cols, (cols*2)));
	  
	}

}
