package customExceptionPractice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Custom Exception or User Defined Exception
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = scanner.nextInt();
		
		try {
			checkAge(age);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		scanner.close();

	}
	
	static void checkAge(int a) throws AgeException{
		if(a < 18) {
			throw new AgeException("Minor!!!");
		}
	}

}
