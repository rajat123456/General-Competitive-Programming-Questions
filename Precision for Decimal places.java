//Precision for Decimal places

import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		for(int i=0;i<d;i++)
		{
		    BigDecimal f=sc.nextBigDecimal();
		    
		    //6 is constant, replace it for more twisting/precision
		    System.out.println(String.format("%.6f",f));
		}
	}
}
