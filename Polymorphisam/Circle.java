package Polymorphisam;

public class Circle extends Shapes{
	@Override // annotation to check whether method is override or not
	          //this method is run when the object of circle is created   
    public void area() {
    	System.out.println("area of circle is pie*r*r");
    }
}
