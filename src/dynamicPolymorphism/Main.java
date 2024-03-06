package dynamicPolymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//dynamicPolymorphism - polymorphism after the compilation (during the run time)
		
		// Benefit - we can declare an abject and make space for it in memory
		//even if we don't know what type of object we want quite yet
		
		Scanner scanner = new Scanner(System.in);
		
		Animal animal;
		
		System.out.println("Enter your choice");
		System.out.print("1(cat) or 2(dog) : ");
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			animal = new Cat();
			animal.speak();
		}
		else if(choice == 2) {
			animal = new Dog();
			animal.speak();
		}
		else{
			System.out.println("invalid choice");
			animal = new Animal();
			animal.speak();
		}
		
		scanner.close();

	}

}
