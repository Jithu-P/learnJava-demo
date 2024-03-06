package generics;

public class Main {

	public static void main(String[] args) {
		
		/*
		MyIntegerClass myInt = new MyIntegerClass(1);
		MyStringClass myString = new MyStringClass("Hi");
		
		System.out.println(myInt.getValue()); 
		System.out.println(myString.getValue()); 
		*/
		
		/*Instead of creating multiple classes for different data types, 
		 * we can create a generic class
		 * */
		
		// -----------------------------------------------------------------------
		
		/*
		MyGenericClass myInt = new MyGenericClass(1);
		MyGenericClass myString = new MyGenericClass("Hi");
		*/
		
		/*
		MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
		MyGenericClass<String> myString = new MyGenericClass<>("Hi");
		*/
		
		MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(2, 6);
		MyGenericClass<String, Integer> myString = new MyGenericClass<>("Hi", 8);
		
		//angle brackets added to get rid of warnings. Code will work even without them
		
		System.out.println(myInt.getValue()); 
		System.out.println(myString.getValue());
		
	}

}
