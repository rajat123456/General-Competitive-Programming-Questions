import java.util.*;
public class Main
{
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int t=sc.nextInt();
	int count=1;
	for(int i=0;i<t;i++)
	{
	    int arr[]=new int[3];
	    for(int j=0;j<arr.length;j++)
	    {
         arr[j]=sc.nextInt();
	    }
	    
	     Arrays.sort(arr);
	    
	     System.out.print("Case "+count+": ");
	     System.out.println(arr[(0+arr.length-1)/2]);
	     ++count;
	}
	    
	}
}