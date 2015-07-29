package transport.impl.car;

import transport.interfaces.Car;

public class Niva implements Car{

	@Override
	public void drive() {
		System.out.println("Niva can drive too");
		
	}

	@Override
	public void stop() {
		System.out.println(" and Niva can stopped");
		
	}

}
