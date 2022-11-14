package collection;
import java.util.*;
public class threedigitnum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List a=new ArrayList();
         a.add(123);
         a.add(4536);
         a.add(125);
         a.add(12);
         for(int i=0;i<a.size();i++) {
        	 int count=0;
        	 int s=(Integer)a.get(i);
        	 int temp=s;
        	 while(s>0) {
        		 count++;
        		 s=s/10;
        	 }
        	 if(count==3) {
        		 System.out.println(temp);
        	 }
         }
	}

}
