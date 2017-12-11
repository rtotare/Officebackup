package practice;

public class PrintNext {

	public static void main(String[] args) {
		System.out.println("Print next character of given string");
		String str = "aAbBzZ";
		String mainStr = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(str);
		/*for(int i =0 ; i<str.length();i++){
			if(str.charAt(i) == 'z'){
				System.out.print('a');
			}else 
			{
				System.out.print(mainStr.charAt((mainStr.indexOf(str.charAt(i))+1)));
			}
			
		}*/
		
		//Using Ascii value
		
				for (char c: str.toCharArray())
				{
					int ascii =(int) c;
					char res;
					if (ascii == 90){
						res = (char)65 ;
					}
					else
					{
						res=(char)(ascii +1);
					}
						System.out.print(res);
				}

	}

}