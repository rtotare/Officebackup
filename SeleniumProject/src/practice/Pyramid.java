package practice;

public class Pyramid {

	public static void main(String[] args) {
//pyramid
   int n ;
   int num=5; 
   n=num;
   
   //  r=row, s= space, d=display
      
  for( int r=1; r<=num; r++,n--)    //   print one item in first row for 1st execution 
     {
       for(int s=1; s<n; s++)     // loop execute 5 times for 5 rows(row=1 s print 1 , row=2 s print 2)>>  "means s stop when it become r so s<n )
          {
    	  System.out.print(" ");   //   print 4 spaces for 1st execution 
          }
     //  n--;                         // decrement value till 0 and move to next loop
       
       for(int d=1; d<=r; d++)          // used for display purpose 
         {
    	  System.out.print(" " + "*");      // addition above loop  first inner loop then outer loop   Space + row value
         }
       System.out.println(" ");
     }
  
  // lower triangle
 
  for( int r=num; r>=1; r--)    
  {
	
	  for(int s=1; s<=n; s++)     
       {
 	    System.out.print(" ");   
       }
   n++;                         
    
    for(int d=1; d<=r; d++)         
      {
 	   System.out.print(" " +"*");     
      }
    System.out.println(" ");
  }
  
  
  
  
  
  
  
  	}

}
