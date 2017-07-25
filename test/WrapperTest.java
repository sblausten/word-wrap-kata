import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class WrapperTest {

	@Test
	public void wrap_ShouldReturnString() {
		assertEquals("", Wrapper.wrap("", 5));
	}
	
	@Test
	public void wrap_ShouldReturnStringWithBreakAfterEvery5Chars() {
		String testString = "blaa blaa blaa rrrr blaaaa";
		String expectedString = "blaa \nblaa \nblaa \nrrrr \nblaaa\na";
		assertEquals(expectedString, Wrapper.wrap(testString, 5));
	}
	
//	@Test
//	public void splitString_ShouldReturnArrayOfChars() {
//		String testString = "blaa blaa";
//		char[] expectedArray = {'b', 'l', 'a', 'a', ' ', 'b', 'l', 'a', 'a'};
//		assertEquals(expectedArray, Wrapper.toChars(testString));
//	}

}
