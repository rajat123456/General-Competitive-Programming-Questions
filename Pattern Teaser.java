/*Printing Pattern like this->

5 (Number of rows)

1	
2	9	
3	8	10	
4	7	11	14	
5	6	12	13	15	

*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        System.out.println();
        int n=1;
		
		while(n<=rows)
		{
		  System.out.print(n+"\t");
		  
		  int backgap=2, prev=0,val=n;
		  
		  for(int q=1;q<n;q++)
		 {
		      if(q%2!=0) //Odd
		      {
                int nexter=val+prev+(rows-n+1)+(rows-n);		          
                System.out.print(nexter+"\t");
                prev=nexter;
		      }
		  
		  else if(q%2==0) //Even
		  {
		      val=(n-backgap)*2;
		      System.out.print(prev+val+"\t");
		      backgap+=2;
		  }
        }
        System.out.println();
        ++n;
    }
  }
}
