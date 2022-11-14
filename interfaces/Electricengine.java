package interfaces;

public class Electricengine implements Engine {

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("engine stop like electric engine");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("engine stat like electric engine");
	}

	@Override
	public void acc() {
		// TODO Auto-generated method stub
		System.out.println("engine accelerate like electric engine");
	}

}
