package practice;

public class fabonacicseries {

	public static void main(String[] args) {
	
		int a=0; 
		int b=1;
		int sum ;
		int n=10;
		
		System.out.println(a);
		System.out.println(b);
		for(int i=0; i<n; i++)
		{
			sum=a+b;
			a=b;
			//b=a;
			b=sum;
			System.out.println(sum);
		
					
		}
		
				

	}

}
