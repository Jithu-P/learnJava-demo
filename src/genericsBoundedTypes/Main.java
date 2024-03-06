package genericsBoundedTypes;

public class Main {

	public static void main(String[] args) {

		//bounded type: allows you to create the objects of a generic class to have data of specific 
		//derived types. Example - Number
		
		MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(5, 8);
		MyGenericClass<Double, Integer> myInt2 = new MyGenericClass<>(8.2, 6);
		
		//MyGenericClass<Integer, String> myInt3 = new MyGenericClass<>(4, "sdvsdv");
		/*
		 * Above one is restricted by 'bounded type' because we allow data-types only from
		 * the Number class by making the generic parameters 
		 * in 'MyGenericClass' extend the Number class
		 */
		
		System.out.println(myInt.x);
		System.out.println(myInt.y);
		System.out.println(myInt2.x);
		System.out.println(myInt2.y);

		//System.out.println(myInt3.y);

	}

}
