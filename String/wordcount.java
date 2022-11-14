package String;

public class wordcount {
 public static void main(String[] args) {
	String str="my name is a vikas kaushal";
	int space=0;
	for(int i=0;i<str.length()-1;i++) {
		if(str.charAt(i)>='a' && str.charAt(i)<='z') {
			if(str.charAt(i+1)==' ') {
				space++;
						
			}
		}
	}
	System.out.println(space+1);
}
}
