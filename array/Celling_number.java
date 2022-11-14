package array;

public class Celling_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr= {1,2,4,6,9,12,14,16,18,20};
    int target=5;
    int ans=cellingnumber(arr,target);
    System.out.println(arr[ans]);
	}

	public static int cellingnumber(int[] arr, int target) {
		// TODO Auto-generated method stub
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(target>arr[mid]) {
				start=mid+1;
			}
			else if(target<arr[mid]) {
				end=end-1;
			}
			else {
				return mid;
			}		
		}
		return start;
	}

}
