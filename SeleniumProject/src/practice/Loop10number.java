package practice;

public class Loop10number {

	public static void main(String[] args) {
		System.out.println("first 10 number");
		
		for(int i=0; i<=10; i++)
		  {
			System.out.println(i);
		  }
		
		System.out.println("print number between 50 to 100" );
		for (int j=50; j<=100; j++)
		  {
			System.out.println(j);
		  }
		
		int a[]= {10,15,20,25,30};
		int c= a.length;
		System.out.println("sum of all values in array:");
		
		int k=0;
		for(int i=0; i<c; i++)
		  {
	        System.out.println(a[i]);
		    k= k+a[i];
		  }
	
	    System.out.println(k);
				
		System.out.println("Reverse array:");
		
		for(int i=a.length-1; i>=0; i--)
		{
		  System.out.println(a[i]);
		}
	}

}
