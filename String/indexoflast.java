package String;
import java.util.Scanner;

public class indexoflast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a word");
    String str=sc.nextLine();
    System.out.println("enter a target charecter");
    char ch=sc.next().charAt(0);
     int c=lastoccurrence(str,ch);
     System.out.println("last occurrence is at index :"+c);
    
     
	}

	public static int lastoccurrence(String str, char c) {
		// TODO Auto-generated method stub
		char[] charr=str.toCharArray();
		for(int i=charr.length-1;i>=0;i++)
		{
    		if(charr[i]==c)
    		{ 
    			return i;
    		}
		}
		return -1;
		
	
	}
}
