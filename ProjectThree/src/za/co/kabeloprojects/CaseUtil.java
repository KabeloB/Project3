//@Author: Kabelo-Basetse project

package za.co.kabeloprojects;

public interface CaseUtil {

	/*(1)
	 * Accepts Strings and converts it to Camel Case.
	 * 
	 * Example 1:
	 * Input:  Hello World
	 * Output: HelloWorld
	 * 
	 * Example 2:
	 * Input:  I love java
	 * Output: Ilovejava
	 */
	String asCamelCase(String text);
	
	
	
	/*(2)
	 * Accepts Strings and converts it to Snake Case.
	 * 
	 * Example 1:
	 * Input:  Hello World
	 * Output: hello_world
	 * 
	 * Example 2:
	 * Input:  I love java
	 * Output: I_love_java
	 */
	String asSnakeCase(String text);
	
	
	
	/*(3)
	 * Accepts Strings and converts it to Human Readable Text.
	 * 
	 * Example 1:
	 * Input:  hello_world
	 * Output: Hello world
	 * 
	 * Example 2:
	 * Input:  I_love_java
	 * Output: I love you
	 */
	String asHumanReadableText(String text);
	
}
