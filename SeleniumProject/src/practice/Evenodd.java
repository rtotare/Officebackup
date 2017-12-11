package practice;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String str ="";
	//	System.out.println("Enter your string");
	//			scanner sc.
				
				
				
 String str= "0123456789";
 String even="";
 String odd="";
 
 for(int i=0; i<str.length(); i++)
 {
	 Character a=str.charAt(i);
	 if(i%2==0)
				 
	 {
		even += a;
		 
	 }
	 else
	 {
		 odd += a;
		 
	 }
	 
 } 
	
	System.out.println(str);
	System.out.println(even+ "*****" +odd);
	
	}

}
