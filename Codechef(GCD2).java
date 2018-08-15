import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++)
    {
      int a=sc.nextInt();
      String sec=sc.next();
      
      int b=0;
      if(a==0)
     {
      System.out.println(b);
      continue;
     }
      for(int q=0;q<sec.length();q++)
      {
        int num=Integer.parseInt(sec.charAt(q)+"");
        b=((b*10)%a + (num)%a)%a;
      }
      
      System.out.println(gcd(a,b));
    }   
   }
  
  static int gcd(int a, int b)
  {
    if(b==0)
      return a;
    
    return gcd(b,a%b);
  }
}
