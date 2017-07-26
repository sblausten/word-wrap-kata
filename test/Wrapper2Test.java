import static org.junit.Assert.*;

import org.junit.Test;

public class Wrapper2Test {

	@Test
	public void wrap_ShouldReturnEmptyString() {
		assertEquals("", Wrapper2.wrap("", 2));
	}

}
