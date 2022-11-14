package Arraylist;
  import java.util.*;
public class maxnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the size of array");
         int n=sc.nextInt();
         int[] arr=new int[n];
         System.out.println("enter the element of array");
         for(int i=0;i<arr.length;i++) {
        	 arr[i]=sc.nextInt();
         }
         int x=arr.length;
         int ans=maxnum(x,arr);
         System.out.println("max element is"+ans);
	}

	public static int maxnum(int n, int[] arr) {
		// TODO Auto-generated method stub
		if(n==1) {
			return arr[0];
		}
		return Math.max(arr[n-1], maxnum(n-1,arr));
	}

}
