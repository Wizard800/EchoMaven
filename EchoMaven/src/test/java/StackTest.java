import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void isEmptyTest() {
		Stack stack = new Stack();
		assertTrue(stack.isEmpty());
	}
	@Test
	public void pushTest() {
		Stack stack = new Stack();
		String expected = "Hello, World!";
		String actual = stack.push(expected);
		assertEquals(expected, actual);
	}
	
	@Test
	public void pushIsEmptyTest() {
		Stack stack = new Stack();
		String expected = "Hello, World!";
		String actual = stack.push(expected);
		assertFalse(stack.isEmpty());
	}
}
