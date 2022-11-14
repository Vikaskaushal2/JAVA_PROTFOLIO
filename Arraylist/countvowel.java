package Arraylist;
import java.util.*;
public class countvowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String s=sc.next();
      int vowel=countVowel(s);
	}

	private static int countVowel(String s) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(Vowel(s.charAt(i))) {
			   count++;	
			}
		}
		return count;
	}

	public static boolean Vowel(char ch) {
		// TODO Auto-generated method stub
		if(ch=='a' || ch=='e' || ch=='o' || ch=='u' || ch=='i' || ch=='A' || ch=='E' || ch=='I'|| ch=='O'  );
		{
			return true;
		}
	}

}
