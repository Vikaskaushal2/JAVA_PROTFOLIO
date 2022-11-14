package array;

import java.util.Scanner;
public class elementsearching {

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
    
      String ans=search(arr,target);
     System.out.println(ans);
	}
	public static String search(int[] arr,int target) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				count++;
			}
				
			}
		if(count>=1) {
			return "element is present";
		}
		return "element is not present";
		}
	}
    
    

