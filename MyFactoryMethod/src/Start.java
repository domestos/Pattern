import cars.Car;
import cars.Jeep;
import cars.NewJeep;
import cars.pattern.CarFactory;
import road.RoadType;

public class Start {

	public static void main(String[] args) {
			CarFactory carFactory = new CarFactory();
			Car car ;	
			
			car = carFactory.getCar(RoadType.CITY); // Car car = new Porsche();
			car.drive();
			car.stop();
			
			
			car = carFactory.getCar(RoadType.OFF_ROAD); //Car car = new Jeep();
			car.drive();
			car.stop();

			
			car =  carFactory.getCar(RoadType.OTHE_ROAD); //Car car =  new NewJeep();
			car.drive();
			car.stop();
			
			
			/*
			NewJeep newJeep = new NewJeep();
			newJeep.newFunction();
			*/
	
	}

}
