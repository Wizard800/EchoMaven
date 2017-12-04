import static org.junit.Assert.*;

import org.junit.Test;

public class EchoTest {

	@Test
	public void testEcho() {
		String expected = "Hello, World";
		String actual = Echo.echo(expected);
		assertEquals(expected, actual);
	}

}
