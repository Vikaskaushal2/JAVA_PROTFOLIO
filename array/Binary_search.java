package array;

public class Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr= {1,2,4,5,7,9,21,23,29,30};
     int target=29;
     int ans=binarysearch(arr,target);
     System.out.println(ans);
	}
	public static int binarysearch(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(end+start)/2;
			if(target>arr[mid]) {
			  start=mid+1;	
			}
			else if(target<arr[mid]) {
				end=mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;// if not found
	}

}
