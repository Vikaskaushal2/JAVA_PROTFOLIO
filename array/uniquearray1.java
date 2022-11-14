package array;

import java.util.Scanner;

public class uniquearray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         System.out.println("enter the size of array");
         int n=sc.nextInt();
         System.out.println("enter element of array");
         int[] arr=new int[n];
         for(int i=0;i<arr.length;i++) {
        	 arr[i]=sc.nextInt();
         }
        for(int i=0;i<arr.length;i++) {
        	boolean b=false;
        	for(int j=0;j<i;j++) {
        		if(arr[i]==arr[j]) {
        			b=true;
        			break;
        		}
        	}
        	if(!b) {
        		System.out.print(arr[i]+" ");
        	}
        }
	}

}
