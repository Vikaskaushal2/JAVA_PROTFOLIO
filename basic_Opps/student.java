package basic_Opps;

public class student {
  String name;
  int age;
  int rollno;
  student(String name,int age,int rollno)
  {
	  this.name=name;
	  this.age=age;
	  this.rollno=rollno;
  }
  public void dispaly(){
	System.out.println("name is:"+name);
	System.out.println("age is :"+age);
	System.out.println("roll no :"+rollno);
  }
}
