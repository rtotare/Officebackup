package practice;

import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {
	
		String word= " ";
		System.out.println("enter your words");
		Scanner sc= new Scanner(System.in);
				word=sc.nextLine();
		int count=0;
		System.out.println(word.length());
		
		
		for(int i=0; i<word.length(); i++)
		{
			if(word.charAt(i) == ' ')
			
			{ 
				count++;
			}
			
		}
			System.out.println(count);
		}
				
		
	
		}


