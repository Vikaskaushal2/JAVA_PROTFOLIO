package String;
import java.util.Scanner;

public class Indexofmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a word");
    String str=sc.nextLine();
    System.out.println("enter a target charecter");
    char ch=sc.next().charAt(0);
     int c=firstoccurrence(str,ch);
     System.out.println("first occurrence is at index :"+c);
    
     
	}

	public static int firstoccurrence(String str, char c) {
		// TODO Auto-generated method stub
		char[] charr=str.toCharArray();
		for(int i=0;i<charr.length;i++)
		{
    		if(charr[i]==c)
    		{ 
    			return i;
    		}
		}
		return -1;
		
	
	}
}
