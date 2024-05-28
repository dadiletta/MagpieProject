import java.util.Scanner;

public class StringExplorer {
	
    public static void main(String[] args) {
        
        // Count down with a "T minus 5"
        

        // Declare and instantiate a Scanner
        Scanner s = new Scanner(System.in);
        // infinite loop 

            
            // take an input
            // repeat input + message
            // implement "equals" to stop with the word "stop"

      
        /*
        ---------------------------
          SAMPLE STUFF
        ---------------------------
        */
        String sample = "The quick brown fox jumped over the lazy dog.";
      
        // Print the sample and add a blank line after
        System.out.println("OUR SAMPLE: " + sample);
  		
        //  Demonstrate the length method.
  		int l = -1;
  		System.out.println ("sample.length() = " + l);
  
  		//  Demonstrate the indexOf method.
  		int position = -1;
  		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
        //  Demonstrate the toLowerCase method.
		String lowerCase = "-1";
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
				
		//  toUpperCase
        System.out.println("sample.toUpperCase() = " + -1);

        // lastIndexOf
        System.out.println("index of d: " + -1);
        System.out.println("lastIndex of d: " + -1);

        // substring
        // MY MISSION: Print the word "dog" using no numbers
        // find the INDEX of dog
        System.out.println(sample);

        
        // equals
        // String x = new String("Hello");
        // String y = new String("Hello");
        // compare aliases
        // System.out.println(x==y);
        // compare value/contents
        // System.out.println(x.equals(y));

	}
}
