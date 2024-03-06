package objectPassing;

public class Main {

	public static void main(String[] args) {

		Food food1 = new Food("Rice");
		Food food2 = new Food("Pasta");
		
		Container container1 = new Container("Chackson");
		container1.fill(food1);
		Refrigerator.put(container1, food1);
		
		Container container2 = new Container("Bowl");
		container2.fill(food2);
		Refrigerator.put(container2, food2);
		
	}

}
