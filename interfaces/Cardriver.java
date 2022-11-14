package interfaces;

public class Cardriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //  Car car=new Car();
      // car.brake();
   //    car.start();
     //  car.acc();
     //  car.start();
      // System.out.println(car.a);
//		Engine car=new Car();
//		((Car) car).brake();
//	   car.start();
//	   car.acc();
//	  car.start();
		//Media mymedia=new Car();
	//mymedia.start();// here output is engine start so we have to create class for every inter face
	Mycar car=new Mycar();
	car.acc();
	car.startmusic();
	car.stop();
	car.startmusic();
	car.upgradengine();
	car.acc();
		
	}

}
