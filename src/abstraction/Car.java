package abstraction;

public class Car extends Vehicle{

	Car(){
		
	}
	
	@Override
	public void stop() {
		System.out.println("break!!!");
	}
	
}
