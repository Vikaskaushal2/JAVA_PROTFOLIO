package String;

public class Revwordbyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="my name is vikas kaushal";
         String s1=  rev(str);
         System.out.println(s1);
	}

	private static String rev(String str) {
		// TODO Auto-generated method stub
		String[] str2=str.split(" ");
		String revstring="";
		for(int i=0;i<str2.length;i++) {	
	      revstring= revstring+reverse(str2[i])+" ";
		}
		return revstring;
		
	}

	private static String reverse(String item) {
		// TODO Auto-generated method stub
		char[] ch=item.toCharArray();
		char[] ch1=new char[item.length()];
		for(int i=0;i<ch.length;i++) {
			ch1[i]=ch[ch.length-1-i];
		}
		
	
		//System.out.println(s);
		return new String(ch1);
	}
    
	
	}


