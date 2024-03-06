package myfirstprogramme;

public class Bicycle extends Vehicle {

	double tyrePressure;
	
	Bicycle(double tp, String colour){
		super(colour);
		this.tyrePressure = tp;
	}
	
	@Override
	void drive() {
		System.out.println("you r riding a " + super.colour + " coloured bicycle "
				+ "and it's tyre pressure is " + this.tyrePressure + " pascals");
	}
	
	public String toString() {
		return this.tyrePressure + "\n" + super.colour;
	}
	
}
