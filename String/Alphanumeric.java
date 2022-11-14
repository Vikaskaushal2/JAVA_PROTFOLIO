package String;
import java.util.Scanner;
public class Alphanumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter a String");
	    String st=sc.nextLine();
	    String str=st.toLowerCase();
	    boolean b=aplhanumeric(str);
	    if(b==true) {
	    	System.out.println("it is alphanumeric");
	    }
	    else {
	    	System.out.println("it is not alphanumeric");
	    }
	}

	public static boolean aplhanumeric(String str) {
		// TODO Auto-generated method stub
		char[] ch=str.toCharArray();
		int num=0;
		int alpha=0;
		for(int i=0;i<ch.length;i++) {
             if(ch[i]>='0' && ch[i]<='9') {
            	 num++;
             }
             if(ch[i]>='a' && ch[i]<='z') {
            	 alpha++;
             }
			
           }
		  if(num>0 && alpha>0) {
			  return true;
		  }
			
		
		return false;
	}

}
