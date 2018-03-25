import java.util.*;
public class Main
{
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int count=1;
	int t=sc.nextInt();
	
	for(int i=0;i<t;i++)
	{
	  int d=sc.nextInt();
	  
	  int arr[]=new int[d];
	  for(int j=0;j<arr.length;j++)
	  {
	      arr[j]=sc.nextInt();
	  }
	  Arrays.sort(arr);
	  System.out.print("Case "+count+": ");
	  System.out.println(arr[arr.length-1]);
	  ++count;
	}
	
	}
}