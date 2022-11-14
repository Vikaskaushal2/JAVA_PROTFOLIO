package String;

public class Revwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="my name is vikas kaushal";
       String s2=reverseword(s);
       System.out.println(s2);
    		   
	}

	private static String reverseword(String s) {
		// TODO Auto-generated method stub
		String[] s3=split(s);
		String revstring="";
//	    for(String item:s3) {
//	    	System.out.println(item);
//	    }
//	 //   System.out.println(s3.length);
		for(int i=0;i<s3.length;i++) {	
	      revstring= revstring+reverse(s3[i])+" ";
		}
		return revstring;
		
	}

	private static String reverse(String string) {
		char[] ch=string.toCharArray();
		char[] ch1=new char[string.length()];
		for(int i=0;i<ch.length;i++) {
			ch1[i]=ch[ch.length-1-i];
		}
		
	
		//System.out.println(s);
		return new String(ch1);
	}
    
	
	

	private static String[] split(String s) {
		// TODO Auto-generated method stub
		String s4=s.trim();
    	String[] s5=new String[lengthofstrarray(s4)];
	     char[] ch=s4.toCharArray();
		int index=0;
		 String temp="";
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]!=' ') {
				
				s5[index]= temp+ch[i];
				temp=s5[index];
				
			}
			else {
				index++;
				temp="";
			}
		}
		return s5;
	}

	private static int lengthofstrarray(String s4) {
		// TODO Auto-generated method stub
		char[] ch=s4.toCharArray();
		int space=1;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				space++;
			}
		}
		return space;
	}

}
