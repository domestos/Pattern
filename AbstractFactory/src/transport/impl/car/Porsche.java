package transport.impl.car;

import transport.interfaces.Car;

public class Porsche implements Car {

	@Override
	public void drive() {
		System.out.println("Porsche can cool drive");
		
	}

	@Override
	public void stop() {
		System.out.println("And cool stopped");		
	}

}
