package Encasulation;

public class EmployDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employ e1=new Employ();
       Employ e2=new Employ();
       e1.setname("vikas kaushal");
       e1.setage(23);
       e1.setsal(27000);
       System.out.println("name of employ is "+e1.getname());
       System.out.println("age of employ is "+e1.getage());
       System.out.println("salary of employ is "+e1.getsalary());
       System.out.println("=========================");
       e2.setname("shailendra");
       e2.setage(23);
       e2.setsal(34242);
       System.out.println("name of employ is "+e2.getname());
       System.out.println("age of employ is "+e2.getage());
       System.out.println("salary of employ is "+e2.getsalary());
	}

}
