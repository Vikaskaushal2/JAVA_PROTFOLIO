package Static_keyword;

public class program1 {
   static int a=30;
   public static void main(String[] args) {
	System.out.println(a);
	System.out.println(b);
	//System.out.println(program2.c);
	System.out.println(program2.a);
  int t=program2.a+a;
  System.out.println(t);
  program2.a=100;//changing the value of global variable
  System.out.println(program2.a);
  int a=120;//local
  System.out.println(a);//local
  System.out.println(program1.a);//global
  
}
   static int b=40;
}
