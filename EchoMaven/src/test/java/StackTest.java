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
	@Test
	public void pushPopIsEmptyTest() {
		Stack stack = new Stack();
		String expected = "Hello, World!";
		stack.push(expected);
		String actual = stack.pop();
		assertTrue(stack.isEmpty());
	}
	@Test
	public void multiPushPopTest() {
		Stack stack = new Stack();
		String expected = "Item 1";
		String expected2 = "Item 2";
		stack.push(expected);
		stack.push(expected2);
		String actual = stack.pop();
		assertEquals("We should get " + expected2, expected2, actual);
	}
}
