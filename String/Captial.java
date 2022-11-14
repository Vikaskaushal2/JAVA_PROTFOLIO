package String;

public class Captial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s=new String(" vikas kaushal ");
     char[] c=s.toCharArray();
     for(int i=0;i<c.length-1;i++) {
     if(c[0]>='a' && c[0]<='z'){
    	 c[0]=(char)(c[0]-32);
     }
     
     
     
     if(c[i]==32) {
    	 if(c[i+1]>='a' && c[i+1]<='z') {
        	 c[i+1]=(char)(c[i+1]-32);
         }
     }
     
     }
     String st=new String(c);
     System.out.println(st);
	}

}
