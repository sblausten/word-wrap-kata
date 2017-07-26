import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class WrapperTest {

	@Test
	public void wrap_ShouldReturnEmptyString() {
		assertEquals("", Wrapper.wrap("", 5));
	}
	
	@Test
	public void wrap_ShouldReturnStringShorteerThanColWidth() {
		assertEquals("test", Wrapper.wrap("test", 5));
	}
	
	@Test
	public void wrap_ShouldReturnTwoWrappedWords() {
		assertEquals("test\ntest", Wrapper.wrap("test test", 6));
	}
	
	@Test
	public void wrap_ShouldWrapWordsAccordingToColumnLength() {
		String testString = "blaa blaa blaa rrrr blaaaa raad raad raaaz";
		String expectedString = "blaa blaa\nblaa rrrr\nblaaaa raad\nraad raaaz";
		String actualString = Wrapper.wrap(testString, 12);
		assertEquals(expectedString, actualString);
	}

}
