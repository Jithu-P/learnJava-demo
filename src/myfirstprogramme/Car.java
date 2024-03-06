package myfirstprogramme;

public class Car extends Vehicle{

	int wheels;
	double mileage;
	
	Car(int w, double m, String colour){
		
		super(colour);
		this.wheels = w;
		this.mileage = m;
	}
	
	@Override
	void drive() {
		System.out.println("u r driving a car with " + this.wheels + " wheels, " + 
							this.mileage + " kmph mileage and is " + super.colour + " coloured");
	}
	
	public String toString() {
		return this.wheels + "\n" + this.mileage + "\n" + super.colour;
	}
}
