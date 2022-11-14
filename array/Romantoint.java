package array;

public class Romantoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="XCV";
      char[] ch= {'I','V','X','L','C'};
	  int[] arr= {1,5,10,50,100};
	  char[] c=str.toCharArray();
	  int sum=0;
for(int i=c.length-1;i>0;i--) {
		  for(int j=0;j<ch.length;j++) {
			  if((c[i]==ch[j])) {
				  if(c[i-1]>=c[i]) {
				  sum=sum+arr[j];
				  }
				  else {
					  sum=sum-arr[j];
				  }
			  }
		  }
	  }
  System.out.println(sum);
	}
}
