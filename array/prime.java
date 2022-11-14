package array;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr= {123,1,5377,3,7,2,9,10,15};
     for(int i=0;i<arr.length;i++) {
    	 if(prime(arr[i])) {
    		 System.out.println(arr[i]);
    	 }
     }
     
	}

	private static boolean prime(int a) {
		// TODO Auto-generated method stub
		int count=0;
		if(a==1 || a==0) {
			return false;
		}
		for(int i=2;i<a/2;i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count==0) {
			return true;
		}
		else {
			return false;	
		}
		
	}

	
}
