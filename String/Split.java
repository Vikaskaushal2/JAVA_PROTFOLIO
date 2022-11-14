package String;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="my name is vikas kaushal";
        String[] s2=s.split("\\s");
        for(String f:s2) {
        	System.out.println(f);
        }
        String[] s3=s.split("a");
        for(String f:s3) {
        	System.out.println(f);
        }
        System.out.println(s3.length);
        System.out.println(s2.length);
	}

}
