package practice;

public class Pyrmd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=5;
		int n; 
		n=num;
		
		for(int r=1; r<=num; r++, n--)
		{
			for(int s=1; s<n; s++)
			{
				System.out.print(" ");
			}
			
			for(int d=1; d<=r; d++)
			{
				System.out.println(" " + "*");
			}
			System.out.println(" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
