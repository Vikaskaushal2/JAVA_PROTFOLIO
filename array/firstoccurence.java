package array;

import java.util.Scanner;
public class firstoccurence {

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
    System.out.println("enter target element");
    int target=sc.nextInt();
    
     int ans=occurence(arr,target);
     System.out.println(ans);
	}
	public static int occurence(int[] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
				
			}
		return -1;
		}
	}
    
    

