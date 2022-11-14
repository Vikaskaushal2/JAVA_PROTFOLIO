package array;
import java.util.Scanner;
public class charsortdescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter size of array");
	     int n=sc.nextInt();
	     System.out.println("enter element of array");
	     char[] arr=new char[n];
	     for(int i=0;i<arr.length;i++) {
	    	 arr[i]=sc.next().charAt(0);
	     }
	     char[] ch=sort(arr);
	     for(char i:ch) {
	    	 System.out.println(i);
	     }
	} 
	public static char[] sort(char[] c) {
		boolean b=true;
	 for(int i=0;i<c.length-1;i++) {
		 for(int j=1;j<c.length-i;j++) {
			 if(c[j]>c[j-1]) {
				 char temp=c[j-1];
				 c[j-1]=c[j];
				 c[j]=temp;
				 b=false;
			 }
			 if(b==true) {
				 break;
			 }
		 }
		
	 }
	 return c;
	}

}
