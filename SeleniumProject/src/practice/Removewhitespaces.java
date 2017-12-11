package practice;

public class Removewhitespaces {

 public static void main(String[] args) {
System.out.println("Program to remove white spaces using Replace all function");		
     String str=" i am girl";
     System.out.println(str.replaceAll("\\s", ""));
  
  
 
 System.out.println("Program to remove spaces without replaceAll method");
    String str3="Remove spaces without replaceAll method";
    char [] strArray = str3.toCharArray();
    StringBuffer sb= new StringBuffer();
    for(int i=0; i<strArray.length; i++)
    {
	    if( (strArray[i]!= ' ') && (strArray[i]!= '\t') )
	      {
		    sb.append(strArray[i]);
	     }
    }
  System.out.println(sb);
  
  
 
 System.out.println("Use of trim feature");
    String str1=" black colour ";
    System.out.println(str1);
    System.out.println(str1.trim());
}
}
