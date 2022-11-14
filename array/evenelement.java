package array;
import java.util.Scanner;
public class evenelement{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter size of array");
     int n=sc.nextInt();
     System.out.println("enter element of array");
     int[] arr=new int[n];
     for(int i=0;i<arr.length;i++) {
    	 arr[i]=sc.nextInt();
     }
    
     int[] a= even(arr,n);
     for(int i=0;i<a.length;i++) {
    	 System.out.println(a[i]);
     }
     //System.out.println("sum of element is "+a);
	}
	public static int[] even(int[] arr,int n) {
		    int[] b =new int[n];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
			 	b[i]=arr[i];
			}
		
		}
		return b;
	
	}

}
