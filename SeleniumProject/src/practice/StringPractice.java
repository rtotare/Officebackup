package practice;

import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {
		System.out.println("Count the number of words in a string" );
		System.out.println("Enter the string");
		 
        Scanner sc = new Scanner(System.in);
 
        String s1=sc.nextLine();
 
        String[] words = s1.trim().split(" ");
 
        System.out.println("Number of words in the string = "+words.length);
        
                
      System.out.println("Number of occurrences of a given character in a string without using any loop");
        
        String S= "Learn java is a basic";
        int count=S.length()- S.replace("a", "").length();
        System.out.println("Occurence of a  " + count);
        
        System.out.println("Substring of given string:");
        System.out.println(S.substring(0));
       System.out.println(S.substring(1,3));
       
     System.out.println("Method to reverse string using loop");
       
       String str1 = "sky is blue";
      // char[] str1= str1.
       
     //  char[] str1Array =str1.toCharArray();
       
    //   for (int i = str1Array.length - 1; i >= 0; i--)
      // {
     //      System.out.print(str1Array[i]);    
     //  }
         
              
       System.out.println("Method to reverse string without using loop");
       // Call static method here written below: 
      System.out.println( StringPractice.recursiveMethod("My java"));
        
	}
		// String str ="My java";
     static String recursiveMethod(String str)
     {
          if ((null == str) || (str.length() <= 1))
          {
                 return str;
          }
      
          return recursiveMethod(str.substring(1)) + str.charAt(0);
       
         
     }

}
