package array;
import java.util.Scanner;
public class sumofodd{

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
     
     int a= sum(arr);
     System.out.println("sum of element is "+a);
	}
	public static int sum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				sum=sum+arr[i];
			}
		}
		return sum;
	}

}
