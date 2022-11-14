package array;
import java.util.Arrays;
import java.util.Scanner;
public class megedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter size of first array");
     int n=sc.nextInt();
     System.out.println("enter element of first array");
     int[] arr1=new int[n];
     for(int i=0;i<arr1.length;i++) {
    	 arr1[i]=sc.nextInt();
     }
     System.out.println("enter size of second array");
     int m=sc.nextInt();
     System.out.println("enter element of second array");
     int[] arr2=new int[m];
     for(int i=0;i<arr2.length;i++) {
    	 arr2[i]=sc.nextInt();
     }
     int[] merged =new int[arr1.length+arr2.length];
     int pos=0;
     for( int item:arr1) {
    	 merged[pos]=item;
    	 pos++;
    	 
     }
     for( int item:arr2) {
    	 merged[pos]=item;
    	 pos++;
    	 
     }
     System.out.println("merged array is"+Arrays.toString(merged));
     
	}

}
