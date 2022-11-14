package array;
import java.util.Scanner;
public class secondmax {

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
	     
	     int[] a=sort(arr);
	     System.out.println("second element is :"+a[a.length-2]);
	}

	public static int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		boolean b=true;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					b=false;
				}
			}
			if(b==false) {
				break;
			}
		}
		return arr;
	}

}
