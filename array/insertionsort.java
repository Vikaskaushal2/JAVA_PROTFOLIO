package array;

public class insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr= {10,4,3,29,19,20};
    int[] a= insertion(arr);
    for(int i:a) {
    	System.out.println(i);
    }
	}
  public static int[] insertion(int[] arr) {
	  for(int i=0;i<arr.length-1;i++) {
		  for(int j=i+1;j>0;j--) {
			  if(arr[j]<arr[j-1]) {
				  swap(arr,j,j-1);
			  }
			  else {
				  break;
			  }
		  }
	  }
	  return arr;
  }
  public static void swap(int[] arr,int j, int k) {
	  int temp=arr[j];
	  arr[j]=arr[k];
	  arr[k]=temp;
  }
}
