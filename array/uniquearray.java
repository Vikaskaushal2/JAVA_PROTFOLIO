package array;
import java.util.Scanner; 
public class uniquearray {

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
        
         int[] arr1=new int[5];
         arr1[0]=arr[0];
         int next=1;
         for(int i=1;i<arr.length;i++) {
        	 boolean b=false;
        	 int element=arr[i];
        	 for(int j=0;j<next;j++) {
        		 if(element==arr1[j]) {
        			 b=true;
        			 break;
        		 }
        	 }
        	 if(b==false) {
        		 arr1[next]=element;
        		 next++;
        	 }
         }
         for(int k:arr1) {
        	 System.out.println(k);
         }
	}

	
	
	

}
