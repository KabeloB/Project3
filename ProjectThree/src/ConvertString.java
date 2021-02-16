import za.co.kabeloprojects.MyStrings;

//@Author: Kabelo-Basetse project


public class ConvertString{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		    System.out.println("===========================================================");
			System.out.println("String conversion project with two (2) examples each below! \n" +
			"=========================================================== \n" );
			
			//Create object for MyStrings class
			MyStrings objStrings = new MyStrings();
			
			//Test cases for MyStrings class methods implemented from CaseUtil interface
			//Camel case examples
		    String camelCase = objStrings.asCamelCase("I love java");
		    String camelCase2 = objStrings.asCamelCase("Hello world");
		    
		    //Snake case examples
		    String snakeCase = objStrings.asSnakeCase("I love java");
		    String snakeCase2 = objStrings.asSnakeCase("Hello world");
		    
		    //Human readable text examples
		    String humanReadable = objStrings.asHumanReadableText("I_love_java");
		    String humanReadable2 = objStrings.asHumanReadableText("Hello_world");
		    
		    
		    //Display results
		    //Camel case examples
		    System.out.println("Camel case results: \n" + camelCase);
		    System.out.println(                         camelCase2 + "\n");
		    
		    //Snake case examples
		    System.out.println("Snake case results: \n" + snakeCase);
		    System.out.println(                         snakeCase2 + "\n");
		    
		    //Human readable text examples
		    System.out.println("Human readable text results: \n" + humanReadable);
		    System.out.println(                                  humanReadable2 + "\n");
		    
		    
		    
		    //Empty parameter validation test 
		    /*
		    String CaseE = objStrings.asCamelCase("");
		    String CaseS = objStrings.asSnakeCase("");
		    String CaseH = objStrings.asHumanReadableText("");
		    */
		    
		    //Results displayed for empty parameters validation test
		    /*
		    System.out.println(CaseE);
		    System.out.println(CaseS);
		    System.out.println(CaseH);
		    */
		    
		    
		    //============
		    //End of Code!
		    //===========
		
	}

	

}
