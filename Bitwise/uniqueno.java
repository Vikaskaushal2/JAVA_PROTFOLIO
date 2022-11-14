package Bitwise;

public class uniqueno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr= {1,6,8,4,3,1,8,6,3};
    int unique=0;
    for(int n: arr) {
    	unique ^=n;
    	
    }
    System.out.println(unique);
	}

}
