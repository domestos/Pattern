package factory.interfaces;

import transport.interfaces.Aircraft;
import transport.interfaces.Car;

public interface TransportFactory {

	Car creatCar();
	
	Aircraft creatAircraft();
	
	
}
