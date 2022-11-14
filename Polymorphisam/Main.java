package Polymorphisam;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Shapes shape=new Shapes();
       shape.area();// 
       Circle circle=new Circle();
       circle.area();
       Shapes shape1=new Circle();
        shape1.area();/// it will run the area method whic is present in the class whose object is created
	}

}
