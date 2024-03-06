package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
			try {
				System.out.print("Enter a number: ");
				int x = scanner.nextInt();
				
				System.out.println();
				
				System.out.print("Enter another number to divide by: ");
				int y = scanner.nextInt();
				
				System.out.println();
				
				double z = (double)x / y;
				System.out.println("Quotient: " + z);
			}catch(ArithmeticException e) {
				System.out.println("cannot divide by zero");
			}catch(InputMismatchException e) {
				System.out.println("u should enter a number only");
			}catch(Exception e) {
				System.out.println("error!!!");
			}finally {
				scanner.close();
			}
			
		
		
		
		
		
		
		
	}

}
