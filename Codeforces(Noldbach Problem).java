import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		int count=0;
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int k=sc.nextInt();
        boolean[]arr=new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0]=arr[1]=false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(arr[i]==true)
            for(int j=i*i;j<arr.length;j+=i)
            {
                arr[j]=false;
            }
        }
        
        int countTrue=0;
        for(int q=0;q<arr.length;q++)
        {
            if(arr[q]==true)
            ++countTrue;
        }
        int[]newest=new int[countTrue];
        int p=0;
        for(int h=2;h<arr.length;h++)
        {
            if(arr[h]==true)
            {
              newest[p]=h;
              ++p;
            }
        }
        
        for(int q=0;q<newest.length-1;q++)
        {
            int num=1+newest[q]+newest[q+1];
            if(num<arr.length && arr[num]==true)
            {
              System.out.println("YESSS-> "+num);
              ++count;
            }
        }
        
        //Since atleast :)
        if(count>=k)
        System.out.print("YES");
        else
        System.out.print("NO");
   }
}