import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 
	 Scanner sc=new Scanner(System.in);
	 
	 String h=sc.nextLine();
	        
	           boolean found=true;
	           int i=0;
	           while(i!=h.length())
	           {
	             if((h.charAt(i)+"").contains("\"") && found==true)
	             {
	                 h=h.replaceFirst("\"","``");
	                 ++i;
	                 found=false;
	             }
	             
	             else if((h.charAt(i)+"").contains("\"") && found==false)
	             {
	                 h=h.replaceFirst("\"","''");
	                 ++i;
	                 found=true;
	             }
	             
	             else
	             ++i;
	             
	           }
	           System.out.println(h);
	        }
	    }