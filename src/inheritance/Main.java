package inheritance;

public class Main {

	public static void main(String[] args) {

		Tea tea1 = new Tea("hot", "empty");
		
		
		Tea tea2 = new Tea("cold", "half");
		
		
		Juice juice1 = new Juice("red", "sweet", "full");
		
		Drinks drink1 = new Drinks("empty");
		
		System.out.println(tea1.teaDetails());
		
	}

}
