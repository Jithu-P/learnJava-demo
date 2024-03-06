package objectPassing;

public class Container {

	String name;
	
	Container(String name){
		this.name = name;
	}
	
	public void fill(Food food) {
		System.out.println(food.name + " is in the " + this.name);
	}
	
}
