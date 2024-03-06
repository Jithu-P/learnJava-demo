package encapsulation;

public class Main {

	public static void main(String[] args) {

		Human human1 = new Human("Ryan", 30);
		
		human1.setName("Mathew");
		human1.setAge(40);
		
		System.out.println(human1.getName());
		System.out.println(human1.getAge());
		
	}

}
