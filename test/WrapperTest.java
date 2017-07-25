import static org.junit.Assert.*;

import java.sql.Wrapper;

import org.junit.Test;

public class WrapperTest {

	@Test
	public void wrap_ShouldReturnString() {
		Wrapper testWrapper = new Wrapper();
		String testString = "blaa blaa blaa blaa blaaaa";
		assertEquals(testString, testWrapper.wrap(testString, 10));
	}

}
