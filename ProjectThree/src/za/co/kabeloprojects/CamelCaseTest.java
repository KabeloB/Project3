package za.co.kabeloprojects;

import static org.junit.Assert.*;

import org.junit.Test;

public class CamelCaseTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		MyStrings objStrings = new MyStrings();
		String output = objStrings.asCamelCase("I love java");
		assertEquals("ILoveJava", output);
	}

}
