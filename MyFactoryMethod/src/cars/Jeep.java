package cars;

public class Jeep implements Car {

	@Override
	public void drive() {
		System.out.println("Drive speed 80 km/h");
		
	}

	@Override
	public void stop() {
		System.out.println("Stopped at 5 sec");
		
	}

	
}
