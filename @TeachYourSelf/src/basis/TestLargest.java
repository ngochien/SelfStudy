package basis;

import junit.framework.TestCase;

public class TestLargest extends TestCase {
	public TestLargest(String name) {
		super(name);
	}

	public void testEmpty() {
		try {
			Largest.largest(new int[] {});
			fail("Should have thrown an exception");
		} catch (RuntimeException e) {
			assertTrue(false);
		}
	}

	public void testAdds() {
		assertEquals(2, 1 + 1);
		assertEquals(4, 2 + 2);
		assertEquals(-8, -12 + 4);
	}
}
