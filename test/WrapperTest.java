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
		String testString = "blaa blaa blaa rrrr blaaaa raad raad raaaz";
		String expectedString = "blaa blaa\nblaa rrrr\nblaaaa raad\nraad raaaz";
		String actualString = Wrapper.wrap(testString, 12);
		assertEquals(expectedString, actualString);
	}

}
