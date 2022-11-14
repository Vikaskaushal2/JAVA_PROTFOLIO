package array;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr= {12,14,90,1,0,2,3};
         int[] a=sorted(arr);
         for(int i:arr) {
        	 System.out.println(i);
         }
	}
	public static int[] sorted(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int last_index=arr.length-1-i;
			int maxelement_index=getindex(arr,0,last_index);
			   swap(arr,maxelement_index,last_index);
			
		}
		return arr;
	}
	public static int getindex(int[] arr,int start,int last) {
		int max=start;
		for(int i=start+1;i<=last;i++) {
			if(arr[max]<arr[i]) {
				max=i;
			}
		}
		return max;
	}
	public static void swap(int[] arr,int max,int last) {
		int temp=arr[last];
		arr[last]=arr[max];
		arr[max]=temp;
	}

}
