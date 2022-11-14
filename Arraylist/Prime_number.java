package Arraylist;
import java.util.*;
public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Integer> l1=new ArrayList<Integer>();
       ArrayList<Integer> l2=new ArrayList<Integer>();
        l1.add(45);
        l1.add(3);
        l1.add(19);
        l1.add(23);
        l1.add(6);
        for(int i=0;i<l1.size();i++) {
        	if(prime(l1.get(i))) {
        		l2.add(l1.get(i));
        	}
        }
        Iterator itr=l2.iterator();//getting the Iterator  
        while(itr.hasNext()){//check if iterator has the elements  
         System.out.println(itr.next());//printing the element and move to next  
        }
       
	}

	private static boolean prime(int x) {
		int count=0;
		int factor=2;
		while(factor<=x/2) {
			if(x%factor==0) {
				count++;
			}
			factor++;
		}
		if(count==0) {
			return true;
		}
		else {
			return false;	
		}
		
	}

}
