package interfaces;

public class Car implements Engine,Brake,Media {
   int a=10;
	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("i brake car like a normal car");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("i stop car engine like a normal car");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("i start  car engine  like a normal car");
	}

	@Override
	public void acc() {
		// TODO Auto-generated method stub
		System.out.println("i accelerate car like a normal car");
	}

}
