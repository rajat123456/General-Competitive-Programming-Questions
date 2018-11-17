import java.util.*;
public class Main
{
	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);		
		int rows=sc.nextInt();
		int n=1;
		
		while(n<=rows)
		{
		    //Odd
		    if(n%2!=0)
		    {
		        for(int q=0;q<6;q++)
		        System.out.print(n);
		        
		        System.out.print(n+1);
		    }
		    
		    //Even
		    else if(n%2==0)
		    {
		        System.out.print(n+1);
		        
		        for(int q=0;q<6;q++)
		        System.out.print(n);
		    }
		    
		    System.out.println();
		    ++n;
		}
	}
}
