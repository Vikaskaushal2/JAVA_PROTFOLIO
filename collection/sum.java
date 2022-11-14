package collection;
import java.util.*;
public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Collection c=new ArrayList();
      c.add(12);
      c.add(13);
      c.add(25);
      int sum=0;
      for(Object x:c) {
    	  sum=(Integer)x+sum;
      }
      System.out.println(sum);
	}

}
