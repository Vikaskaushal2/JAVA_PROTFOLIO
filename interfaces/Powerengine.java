package interfaces;

public class Powerengine implements Engine {

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("power engine start");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(" power engine start");
	}

	@Override
	public void acc() {
		// TODO Auto-generated method stub
		System.out.println("power engine accelerated");
	}

}
