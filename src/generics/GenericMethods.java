package generics;

public class GenericMethods {

	public static void main(String[] args) {
		
		/*
		 * enable types (classes and interfaces) to be parameters when defining classes, 
		 * interfaces and methods
		 * Benefit - eliminates the need to create multiple versions of methods or classes
		 * for various data types. We can use 1 version for all REFERENCE data types
		 * */

		Integer[] intArray = {1, 5, 8, 6};
		Character[] charArray = {'d', 'r', 'g'};
		String[] stringArray = {"sdsdv", "hnth"};
		
		//displayArray(intArray);
		//displayArray(charArray);
		//displayArray(stringArray);
		
		displayArray(intArray);
		displayArray(charArray);
		displayArray(stringArray);
		
		System.out.println();
		
		System.out.println(getFirstElement(intArray));
		System.out.println(getFirstElement(charArray));
		System.out.println(getFirstElement(stringArray));
		
	}
	
	public static <T> void displayArray(T[] myArray) {
		for(T i: myArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	
	//practice method to return a generic thing from a method. 
	//'T' before method name is the return type
	public static <T> T getFirstElement(T[] myArray) {
		return myArray[0];
	}
	
		/*
		public static void displayArray(Integer[] intArr) {
			for(Integer i: intArr) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		public static void displayArray(Character[] charArr) {
			for(Character i: charArr) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		public static void displayArray(String[] strArr) {
			for(String i: strArr) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		*/
		
}


