package String;
import java.util.Scanner;
public class palliandrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter string");
     String s=sc.nextLine();
     String rev="";
     for(int i=s.length()-1;i>=0;i--) {
    	rev=rev+s.charAt(i);
    	
     }
     if(rev.equals(s)) {
    	 System.out.println("yes it is pallendrom");
     }
     else {
    	 System.out.println("no it is not p[allendrom");
     }
	}

}
