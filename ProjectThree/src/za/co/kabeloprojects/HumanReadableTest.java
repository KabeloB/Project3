package za.co.kabeloprojects;

import static org.junit.Assert.*;

import org.junit.Test;

public class HumanReadableTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		MyStrings objStrings = new MyStrings();
		String output = objStrings.asHumanReadableText("I_love_java");
		assertEquals("I love java", output);
	}

}
