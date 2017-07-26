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
		assertEquals("test \ntest", Wrapper2.wrap("test test", 6));
	}
	
	@Test
	public void wrap_ShouldWrapStringAtLastSpaceBeforeColEnd2() {
		assertEquals("test \ntest", Wrapper2.wrap("test test", 5));
	}
	
	@Test
	public void wrap_ShouldWrapStringAtLastSpaceBeforeColEnd4() {
		assertEquals("test \ntest", Wrapper2.wrap("test test", 4));
	}
	
	@Test
	public void wrap_ShouldWrapStringAtLastSpaceBeforeColEnd3() {
		assertEquals("tes\nt \ntes\nt", Wrapper2.wrap("test test", 3));
	}
	
	@Test
	public void wrap_ShouldWrapStringAtLastSpaceBeforeColEnds() {
		String result = Wrapper2.wrap("test testerr teste", 6);
		System.out.println(result);
		assertEquals("test \ntester\nr \nteste", result);
	}

}
