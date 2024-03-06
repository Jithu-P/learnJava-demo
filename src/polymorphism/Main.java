package polymorphism;

public class Main {

	public static void main(String[] args) {
		
		/*
		polymorphism - ability of an object to identify ass more than one type (often, more than one datatype)
		Here, car, bike and bus objects can identify as a vehicle object
		Also, all objects are the children classes of the 'Object' class. So they can also
		identify as 'Objects' 
		*/
		
		Bike bike = new Bike();
		Car car = new Car();
		Bus bus = new Bus();
		
		/*
		 bike.go();
		 car.go();
		 bus.go(); 
		*/
		
		/* Bike[] racers = {bike, car, bus}; - will not work since car and bus 
			cannot be stored in a bike array */
		
		Vehicle[] racers = {bike, car, bus}; //works since all three can identify as Vehicle
		
		for(Vehicle i: racers) {
			i.go(); // in-order to implement this, we should create a go method in Vehicle class
		}

		
	}

}
