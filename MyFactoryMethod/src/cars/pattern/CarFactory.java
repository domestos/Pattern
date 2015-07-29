package cars.pattern;

import cars.Car;
import cars.Jeep;
import cars.NewJeep;
import cars.Porsche;
import road.RoadType;

//this class creating new car
public class CarFactory {
	
	public Car getCar(RoadType roadType) {
		Car car = null;
		
		switch(roadType){
			
			case CITY:
				car = new Porsche();
				break;
			
			case OFF_ROAD:
				car = new Jeep();
				break;
			
			case OTHE_ROAD:
				car = new NewJeep();
				break;			
		}
		
		return car;
	}

}
