package basic_Opps;

public class Employ {
 String name;
 int age;
 int salary;
 Employ(String n,int a,int s){
	 name=n;
	 age=a;
	 salary=s;
 }
 public void Display_employ() {
	 System.out.println("name is"+name);
	 System.out.println("age is"+age);
	 System.out.println("salary is"+salary);
 }
}
