import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int n=1;
		int counter=1;
		while(n<=rows)
		{
		    //Odd
		    if(n%2!=0)
		    {
		        for(int q=0;q<n;q++)
		        {
		            if(q==n-1)
		            System.out.print(counter);
		            
		            else
		            System.out.print(counter+"*");
		            
		            ++counter;
		        }
		    }
		    
		    //Even
		    else if(n%2==0)
		    {
		        int shounter=counter;
		        int ways=1;
		        int toprint=shounter+n-1;
		        while(ways<=n)
		        {
		            if(ways==n)
		            System.out.print(toprint);
		            
		            else
		            System.out.print(toprint+"*");
		            
		            ++counter;
		            ++ways;
		            --toprint;
		        }
		    }
		    
		    ++n;
		    System.out.println();
		}
		
		
	}
}
