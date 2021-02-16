//@Author: Kabelo-Basetse project

package za.co.kabeloprojects;

public class MyStrings implements CaseUtil {

	//Default constructor
	public MyStrings()
	{
		
	}
	
	//Accepts Strings and converts it to Camel Case.
	@Override
	public String asCamelCase(String text) {
		// TODO Auto-generated method stub
		
		////validate the input string first
		if (text == null || text.length() < 1) 
		{ 
			return "Error - No input found for (Camel Case)!"; 
		} 
		
		
	    String result = "";
	    for (String part : text.toLowerCase().split(" ")) 
	    {
	    	//validate the length of string
	        if (part.length() < 1) { 
	            continue;
	        }
	        
	        result += part.substring(0, 1).toUpperCase();
	        
	        //validate the length of string
	        if (part.length() > 1) 
	        { 
	            result += part.substring(1);
	        }
	    }
	    
		return result;
	}

	
	
	//Accepts Strings and converts it to Snake Case.
	@Override
	public String asSnakeCase(String text) {
		// TODO Auto-generated method stub
		
		//validate the input string first
		if (text == null || text.length() < 1) 
		{ 
			return "Error - No input found for (Snake Case)!"; 
		} 
		
		int n = text.length(); 
	    String result = ""; 
	  
	    for (int i = 0; i < n; i++) 
	    { 
	        //Insert underscore to replace empty space
	        if (text.charAt(i) == ' ') 
	        	result = result + '_'; 
	        else
	          
	            //Convert character to lower case if there is not empty space
	        	result = result + Character.toLowerCase(text.charAt(i)); 
	    } 
		
	    //Change first letter of result string to upper case
	    String resultOne = result.toUpperCase().charAt(0)+result.substring(1,result.length());
	    
		return resultOne;
	}
	
	
	
	//Accepts Strings and converts it to Human Readable Text.
	@Override
	public String asHumanReadableText(String text) {
		// TODO Auto-generated method stub
		
		
		int n = text.length(); 
	    String result = ""; 
	    
	    //validate the input string first
		if (text == null || text.length() < 1) 
		{ 
			return "Error - No input found for (Human readable text)!"; 
		} 
			
			
		for (int i = 0; i < text.length(); i++) 
		{ 
			text.toLowerCase().split("_");
				
			//Insert empty space to replace underscore in snake case string text received
		    if (text.charAt(i) == '_') 
		        result = result + ' '; 
		    else
		        //Convert character to lower case if there is not empty space
		        result = result + Character.toLowerCase(text.charAt(i)); 
		        
		}
		
		//Change first letter of result string to upper case
		String resultOne = result.toUpperCase().charAt(0)+result.substring(1,result.length());
		
		return resultOne;
	}

}
