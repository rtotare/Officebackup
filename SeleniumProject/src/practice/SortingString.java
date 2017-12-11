package practice;

import java.util.Scanner;

public class SortingString {

	public static void main(String[] args) {
		String  temp;
System.out.println("Enter string which you want to sort");
Scanner sc=new Scanner(System.in);
String [] name= new String[5];
for(int i=0; i<5; i++)
	name[i] =sc.nextLine();

 for(int i=0; i<5; i++)     // Check till string length 
    {
	 for(int j=1; j<5; j++)      // Check the first character of word
	    {
		      if(name[j-1].compareTo(name[j])>0) //
	           {
		            temp= name[j-1];
		            name[j-1]= name[j];
		            name[j]=temp;
		 	    }
          }
    }
 for(int i=0; i<5; i++)
System.out.println(name[i]);
	
}
}