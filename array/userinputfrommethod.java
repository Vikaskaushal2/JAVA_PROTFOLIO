package array;
import java.util.Scanner;
public class userinputfrommethod{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter size of array");
     int n=sc.nextInt();
      int[] ar= userinput(n,sc);
      for(int i=0;i<ar.length;i++) {
    	  System.out.println(ar[i]);
      }
	}
     public static int[] userinput(int size, Scanner sc) {
    	 System.out.println("enter element of array");
         int[] arr=new int[size];
         for(int i=0;i<arr.length;i++) {
        	  arr[i]=sc.nextInt();
        	  
         }
		return arr;
     }
}
   