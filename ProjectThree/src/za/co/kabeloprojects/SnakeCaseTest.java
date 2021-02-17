package za.co.kabeloprojects;

import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCaseTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		MyStrings objStrings = new MyStrings();
		String output = objStrings.asSnakeCase("I love java");
		assertEquals("I_love_java", output);
	}

}
