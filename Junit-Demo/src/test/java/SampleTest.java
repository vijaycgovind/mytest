import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SampleTest {

	@Test
	public void simpleTest() {
		int a = 2;
		int b = 2;
		assertTrue(a+b == 4);
	}
	
	@Test
	public void simpleTest1() {
		int a = 3;
		int b = 2;
		assertTrue(a+b == 5);
	}
}

