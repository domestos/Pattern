import factory.impl.UAFactory;
import factory.impl.USAFactory;
import factory.interfaces.TransportFactory;
import transport.interfaces.Aircraft;
import transport.interfaces.Car;

public class Start {

	public static void main(String[] args) {
		
		TransportFactory uaFactory = new UAFactory();
		TransportFactory usaFactory = new USAFactory();
		
		Aircraft aircraft =  uaFactory.creatAircraft();
		
		aircraft.flight();
		
		
		Car car = usaFactory.creatCar();
		
		car.drive();
		
		
		
		
	}
}
