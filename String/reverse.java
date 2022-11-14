package String;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a string");
      String str=sc.nextLine();
      char[] charr=str.toCharArray();
      for(int i=charr.length-1;i>=0;i--) {
    	  System.out.print(charr[i]);
      }
      System.out.println();
     for(int i=str.length()-1;i>=0;i--) {
    	 System.out.print(str.charAt(i));
     }
	} 
	
	

}
