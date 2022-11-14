package Bitwise;

public class findbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=20;
      int findbit=3;
      int ans=n & ( 1 << (findbit-1));
      if(ans==0) {
    	  System.out.println(0);
      }
      else {
    	  System.out.println(1);
      }
	}

}
