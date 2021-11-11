import static org.junit.Assert.*;

import org.junit.Test;

public class FineTest {

	@Test
	public void testIsItFine() {
		Fine fine = new Fine();
		String actual = fine.IsItFine(120, 125);
		String expected = "You must pay a fine";
		assertEquals(actual, expected);
	}

}
