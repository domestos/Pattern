package factory.impl;

import factory.interfaces.TransportFactory;
import transport.impl.aircaraft.TU134;
import transport.impl.car.Niva;
import transport.interfaces.Aircraft;
import transport.interfaces.Car;

public class UAFactory  implements TransportFactory{

	@Override
	public Car creatCar() {
		return new Niva();
	}

	@Override
	public Aircraft creatAircraft() {
		return new TU134();
	}


}
