package practice;

public class Trianglearray {
	
	// print triangle

	public static void main(String[] args) {
		
	System.out.println("4*4 square");		
		//print square	
		
		for(int i=0; i<=3; i++ )
		{
			for(int j=0; j<=3; j++)
			  {
				System.out.print("$");
			  }
			System.out.println();
		}
		       
		
		System.out.println("left hand side Triangle with $");
		for(int i=0; i<=3; i++)
		{
			for( int j=0; j<=i; j++)      // print triangle when j<=i (when row1 print 1, row2 enter 2 values) row stop writing when it become equal and greater than column  
				
			{
				System.out.print("$");
			}
			System.out.println("");
			
		}
		
		
		System.out.println("left hand side Triangle with number");
		for(int i=1; i<=5; i++)
		{
			for( int j=1; j<=i; j++)      // print triangle when j<=i (when row1 print 1, row2 enter 2 values) row stop writing when it become equal and greater than column  
				
			{
				System.out.print(j);
			}
			System.out.println("");
			
		}
		
		
		
		System.out.println("A, B, C in left hand side style");
		int k=65;      //asci value of A in 65//
		for(int i=0; i<=5; i++ )
		{
			for(int j=0; j<=i; j++)
				{
				System.out.print((char)(k++));	
				 }
		  System.out.println();
		  
		}
		
	
		
		System.out.println("right hand side triangle");		
		//print square	
		// i-row j=column
		for(int i=1; i<=4; i++ )
		{
			for(int j=4; j>=1; j--)  //when r1 column print 1 value, r2 print 2, (for r2 j3 will not print  means column value grater than 1
			   {
				if(j>i)    // j>i print blank spaces
				    {
					System.out.print(" ");
				    }
				else
				  {
					System.out.print("@");
				  }	
				}
			  
			System.out.println();
		}
		}
		     
				
	}




