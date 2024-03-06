package listsInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {

		/*
		 * The below one is a generic list, where the values being passed are Objects. They can be of 
		 * different data types in the same List, since all of them can identify as an Object. 
		 * */
		
		List myList = new ArrayList();
		/*
		Since array-list is a class which implements the list interface, it can identify
		as a List also. But we will need to import both the array-list class and the list class
		from 'java.util' package. We can also declare and initialize the array-list as shown below. 
		ArrayList myList = new ArrayList
		This require only one import, the ArrayList class
		*/
		
		myList.add("mouse"); 	// passed values are considered as objects and not Strings
		myList.add(5);
		myList.add('s');
		myList.add(4.8);
		// the above method adds new elements to the 'LAST' place in a list
		
		myList.add(new Integer(10)); // any data type can be passed
		
		
		Object x = myList.get(1); 
		//String x = (String)myList.get(1); // type casting required
		//System.out.println(x);
		
		/*
		 * myList.add();
		 * myList.remove();
		 * myList.size();
		 * myList.get(index);
		 * myList.set(index, "value");
		 * myList.clear();
		 * */
		
		// ** to iterate a list, there are 3 ways:
		//For an array-list, all the three methods are equally fast. However, for a linked list, 
		//the 'for loop' method is a slow one. 
		
		// 1) using the iterator method
		
		Iterator iterator = myList.iterator();
		while(iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next);
			// OR simply System.out.println(iterator.next());
		}
		
		// 2) for-each loop (added in Java 5)
		
		for(Object next: myList) {
			System.out.println(next);
		}
		
		// 3) for loop
		
		for(int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		
		
		////////////////////////////////////////////////////////////////////////////////////////////
		
		
		/*
		 * Below shown is a list with a type
		 * */
		
		// List<Integer> myList2 = new ArrayList<Integer>(); OR
		List<Integer> myList2 = new ArrayList<>(); 	// onle integers can be passed
		
		myList2.add(5);
		/*
		myList2.add(6.7);
		myList2.add(new String("hi"));
		
		not possible since it is a 'Typed List'
		*/
		
		// ***Advantage: type casting steps can be avoided while using methods 
		//               and while iterating through the list
		
		Object z = myList2.get(0);  // to demonstrate it still can identify as an Object
		Integer a = myList2.get(0); // since the compiler knows only Integer can come out of the list
		
		//Note that angle brackets are necessary for iterator also
		Iterator<Integer> iterator2 = myList2.iterator();
		while(iterator2.hasNext()) {
			Integer next = iterator2.next(); // type casting not needed unlike an Untyped List
			System.out.println(next);
		}
		
		for(Integer next: myList2) {
			System.out.println(next);
		}
 		
		
	}

}
