package String;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s1=sc.nextLine();
        System.out.println("enter second string");
         String s3=sc.nextLine();
         char[] ch=s1.toCharArray();
         char[] ch1=sort(ch);
          String s2=new String(ch1);
         char[] ch2=s3.toCharArray();
       char[] ch3=sort(ch2);
         String s4=new String(ch3);
         
         if(s2.compareTo(s4)==0) {
        	 System.out.println("it is anagram");
         }
         else {
        	 System.out.println("it is not anagram");
         }
        
	}

	private static char[] sort(char[] c) {
		// TODO Auto-generated method stub
		for(int i=0;i<c.length;i++) {
        	for(int j=i+1;j<c.length-i;j++) {
        		if(c[j]<c[j-1]) {
        			char temp=c[j];
        			  c[j]=c[j-1];
        			   c[j-1]=temp;
        		}
        		
        	}
		
	}
	return c;
	}
}

