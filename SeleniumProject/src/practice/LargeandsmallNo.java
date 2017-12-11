package practice;

public class LargeandsmallNo {

	public static void main(String[] args) {
		
		int a[] = {4,15,8,21, 34, 56,2,1,83};
		
		int  max = a[0];
		int  min = a[0];

		for(int i=1; i< a.length; i++){
		
			if (a[i]>max) 
			{ 
				max =a[i];
			}else
				if(a[i]<min){ 
			   min= a[i];
		   }
		}
		
		System.out.println(max);
		System.out.println(min);
		}
	}

	


