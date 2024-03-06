package copyObjects;

public class Main {

	public static void main(String[] args) {

		Car car1 = new Car("BMW", 2024);
		
		Car car2 = new Car(car1);
		
		//Car car2 = new Car("Porsche", 2020);
		
		//car1.copy(car2);
		
		System.out.println(car1);
		System.out.println(car2);
		
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());

	}

}
