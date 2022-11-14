package String;
import java.util.Scanner;
public class Findout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a String");
    String str=sc.nextLine();
    String st=str.toLowerCase();
    char[] charr=st.toCharArray();
   
    int vowel=0;
    int consonent=0;
   int digit=0;
   int space=0;
   int special=0;
    for(int i=0;i<charr.length;i++) {
    	if(charr[i]>='a' && charr[i]<='z') {
    		if(charr[i]=='a' || charr[i]=='e'|| charr[i]=='o' || charr[i]=='u'|| charr[i]=='i' ) {
        		vowel++;
        	}
    		else {
    			consonent++;
    		}
    	}
    	
    	else if(charr[i]==' ') {
    		space++;
    	}
    	else if(charr[i]>='0' && charr[i]<='9') {
    		digit++;
    	}
    	else {
    		special++;
    	}
    }
    System.out.println("no of vowel "+vowel);
    System.out.println("no of space "+space);
    System.out.println("no of consonent "+consonent);
    System.out.println("no of digit "+digit);
    System.out.println("no of special charecter "+(space+special));
	}

}
