package array;

public class cyclicsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {5,3,2,1,4};
        int[] a=sort(arr);
        for(int i:a) {
        	System.out.println(i);
        }
        
        }
	  public static int[] sort(int[] arr) {
		  int i=0;
		  while(i<arr.length) {
			  int correct=arr[i]-1;
			  if(arr[i]!=arr[correct]) {
				  swap(arr,i,correct);
			  }
			  else {
				  i++;
			  }
		  }
		  return arr;
	}
	public static void swap(int[] arr, int i, int correct) {
		int temp=arr[i];
		arr[i]=arr[correct];
		arr[correct]=temp;
		
	}

}
