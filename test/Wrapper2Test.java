import static org.junit.Assert.*;

import org.junit.Test;

public class Wrapper2Test {

	@Test
	public void wrap_ShouldReturnEmptyString() {
		assertEquals("", Wrapper2.wrap("", 2));
	}
	
	@Test
	public void wrap_ShouldReturnSameStringIfLengthLessThanCols() {
		assertEquals("test", Wrapper2.wrap("test", 5));
	}
	
	@Test
	public void wrap_ShouldReturnSameStringIfEqualToCols() {
		assertEquals("test", Wrapper2.wrap("test", 4));
	}
	
	@Test
	public void wrap_ShouldReturnTwoWrappedStringsEqualOrLessThanCols() {
		assertEquals("test\ntest", Wrapper2.wrap("testtest", 4));
	}
	
	@Test
	public void wrap_ShouldReturnThreeWrappedStringsEqualOrLessThanCols() {
		assertEquals("test\ntest\ntest", Wrapper2.wrap("testtesttest", 4));
	}
	
	@Test
	public void wrap_ShouldWrapStringAtLastSpaceBeforeColEnd() {
		assertEquals("test\n test", Wrapper2.wrap("test test", 6));
	}

}
