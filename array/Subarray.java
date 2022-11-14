package array;
import java.util.Scanner;
public class Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
       System.out.println("enter size of an array");
       int n=sc.nextInt();
       System.out.println("enter element of array");
       int[] arr=new int[n];
       for(int i=0;i<arr.length;i++) {
    	   arr[i]=sc.nextInt();
       }
       subarray(arr);
	}

	public static void subarray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]);
				}
				System.out.println("");
			}
		}
	}

}
