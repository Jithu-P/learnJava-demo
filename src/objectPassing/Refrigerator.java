package objectPassing;

public class Refrigerator {
	
	public static void put(Container container, Food food) {
		System.out.println(container.name + " is in the refrigerator with " + food.name + " in it" + "\n");
	}
	
}
