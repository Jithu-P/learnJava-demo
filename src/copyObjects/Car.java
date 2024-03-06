package copyObjects;

public class Car {
	
	private String make;
	private int model;

	Car(String make, int model){
	
		this.setMake(make);
		this.setModel(model);
		
	}
	
	Car(Car incomingCar){
		//this.setMake(incomingCar.getMake());
		//this.setModel(incomingCar.getModel());
		
		this.copy(incomingCar);
	}
	
	public String getMake() {
		return this.make;
	}
	
	public int getModel() {
		return this.model;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(int model) {
		this.model = model;
	}
	
	public void copy(Car myCar) {
		this.setMake(myCar.getMake());
		this.setModel(myCar.getModel());
	}
	
}
