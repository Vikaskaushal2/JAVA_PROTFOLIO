package String;

public class charoccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="hello java";
     
       char[] c=s.toCharArray();
       for(int i=0;i<c.length;i++) {
    	   int count=1;
    	   for(int j=i+1;j<c.length;j++) {
    		   if(c[i]==' ') {
    			   break;
    		   }
    		   if(c[i]==c[j]) {
    			   count++;
    		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
    		   }
    		   
    		   
    	   }
    	   System.out.println(c[i]+" "+count);
    
       }
	}

}
