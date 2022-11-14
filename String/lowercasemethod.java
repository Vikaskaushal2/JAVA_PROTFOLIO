package String;
import java.util.Scanner;

public class lowercasemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a word");
    String str=sc.nextLine();
     String c=lowercase(str);
     System.out.println("lower case array is:"+c);
    
     
	}

	public static String lowercase(String str) {
		// TODO Auto-generated method stub
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
    		if(ch[i]>='A' && ch[i]<='Z')
    		{ 
    			ch[i]=(char)(ch[i]+32);
    		}
		}
		String s=new String(ch);
		return s;
	
	}
}
