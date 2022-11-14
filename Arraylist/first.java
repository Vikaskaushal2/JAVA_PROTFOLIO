package Arraylist;

import java.util.ArrayList;
import java.util.Collection;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> l1=new ArrayList<Integer>();
      l1.add(20);
      l1.add(23);
      l1.add(50);
      l1.add(25);
      l1.add(0, 23);
      l1.set(0,24);
     // Collection.sort(l1);
      System.out.println(l1.contains(23));
      System.out.println(l1.size());
      for(int i=0;i<l1.size();i++) {
    	  System.out.println(l1.get(i));
      }
	}

	
}
