package factory.impl;

import factory.interfaces.TransportFactory;
import transport.impl.aircaraft.Boeing747;
import transport.impl.car.Porsche;
import transport.interfaces.Aircraft;
import transport.interfaces.Car;

public class USAFactory implements TransportFactory {

	@Override
	public Car creatCar() {
	return new Porsche();	
	}

	@Override
	public Aircraft creatAircraft() {
		return new Boeing747();
	}

}
