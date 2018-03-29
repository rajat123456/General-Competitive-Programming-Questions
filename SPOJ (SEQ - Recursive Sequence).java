import java.util.*;
public class Main
{
    static Scanner sc=new Scanner(System.in);
	static int d=sc.nextInt();
	static int k=sc.nextInt();
    static int b[]=new int[k];
    static int c[]=new int[k];
    static int ans=0;
    static int res=0;
    static int mod=1000000000;
    static int arr[];
	public static void main(String[] args) {
		
		for(int i=0;i<d;i++)
		{
		    for(int j=0;j<k;j++)
		    {
		       b[j]=sc.nextInt();      
		    }
		    
		    for(int q=0;q<k;q++)
		    {
		       c[q]=sc.nextInt();      
		    }
		    
		    int n=sc.nextInt();
		    
		    arr=new int[y];
		    
		    recur(n);
		    System.out.println(res);
		    System.out.println(res%mod);
	    }
		
	}
	
			static int recur(int n)
			{
			    System.out.println(n+" HAI");
			    if(n<=k)
			    return b[n-1];
			    
			    //Dynamic Programming, dynamically checking whether already computed or not. If yes, then reuse, otherwise Compute
			   
			    else if(arr[n]!=0)
			    {
			        System.out.println("STORED VALUE->");
			        System.out.println(arr[n]);
			        return arr[n];
			    } 
			   
			    else
			    {
			        
			    for(int i=0;i<c.length;i++)
			    {
			        ans=c[i]*recur(n-1);
			        --n;
			        
			        if(i==0)
			        {
			            res=0;
			            res+=ans;
			            
			            //(Dynamic Programming) Here Storing the computed values, into table(implemented as array)
			            
			            if(n>3)
			        
			             {
			               System.out.println("STORING-> "+n);
			               arr[n]=ans/c[i];
			               System.out.println("STORED VALUE-> "+arr[n]);
			             }
			        }
			        
			        else
			            res+=ans;
			        
			    }
			    
			    }
			   
			    return res;
			}
	
}