package array;

public class Submaxarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr= {5,-4,-2,6,-1};
       int ans=maxsumofsubarray(arr);
       System.out.println(ans);
	}

	public static int maxsumofsubarray(int[] arr) {
		// TODO Auto-generated method stub
		int maxsum=0;
		int cursum=0;
		for(int i=0;i<arr.length;i++) {
			cursum=cursum+arr[i];
			if(cursum>maxsum) {
				maxsum=cursum;
			}
			if(cursum<0) {
				cursum=0;
			}
		}
		return maxsum;
	}

}
