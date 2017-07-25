import static org.junit.Assert.*;

import org.junit.Test;

public class WrapperTest {

	@Test
	public void wrap_ShouldReturnString() {
		String testString = "blaa blaa blaa blaa blaaaa";
		assertEquals(testString, Wrapper.wrap(testString, 10));
	}

}
