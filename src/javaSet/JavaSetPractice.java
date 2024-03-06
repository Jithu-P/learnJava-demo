package javaSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class JavaSetPractice {

	public static void main(String[] args) {

		//Set set = new HashSet(); OR
		
		Set<String> set = new HashSet<>();
		
		boolean added1 = set.add("Hello");
		boolean added2 = set.add("Hello");
		
		System.out.println(added1); //true
		System.out.println(added2); //false - Since elements are not unique, second one will not be added
		
		// *To create a Set with a couple of element already added to it: 
		
		Set<String> set2 = Set.of("Dog", "Cat", "Mouse");
		System.out.println(set2);
		//Note: output - [Cat, Mouse, Dog] - Set (Hash-Set) does not guarantee to 
		// keep the order of the values inserted. While, a Tree-Set arranges the values in orderly manner. 
		
		//Since there is no particular order for elements, there is no '.remove(index)' method 
		//available for a Set. 
		
		//Hash-Set is faster than Tree-Set
		Set<String> set3 = new TreeSet<>(); //methods are same for both Hash-Set and Tree-Set
		set3.add("crow");
		set3.add("5");
		set3.add("Eagle");
		set3.add("@");
		set3.add("A");
		set3.add("a");
		
		
		System.out.println(set3); // output - [5, @, A, Eagle, a, crow]
		
		
		/* Ways to iterate a Set:
		 * 1)Iterator
		 * 2)for loop or for-each loop
		 * 3)Using the Java Streams API 
		
		Iterator<String> iterator = set2.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		for(String next: set3) {
			System.out.println(next);
		}*/
		
		Stream<String> stream = set3.stream();
		stream.forEach((i) -> {System.out.println(i);}); // ***lambda expression
		//stream.forEach(i -> System.out.println(i));
		
		
		boolean removed1 = set3.remove("@");
		boolean removed2 = set3.remove("10");
		
		System.out.println(removed1);
		System.out.println(removed2); // false
		
		//set3.clear();
		//set3.size();
		//set3.isEmpty();
		//set3.contains("5");
		
		// To add a bunch of elements to an already existing set
		set3.addAll(Set.of("-6", "pigeon", "Eagle"));
		System.out.println(set3); //output - [-6, 5, A, Eagle, a, crow, pigeon]
		//Note: since 'Eagle' was already there, it was not added again
		
		//similarly, to remove a bunch of elements, 
		set3.removeAll(Set.of("7", "jnbhgv", "crow"));
		
		//To retain only those elements which are common in the 
		//list of elements being passed and the Set
		set3.retainAll(Set.of("5", "A", "100", "10000"));
		System.out.println(set3); // output - [5, A]
		
		//////////////////////////////////////////////////////////////////////////////////
		
		 
		//Note: If we want to eliminate duplicate elements from a list, we don't need to iterate through
		//the list and compare each element to remaining elements. We just need to copy the elements in
		//the list to a Set. This is an application of 'Set' in Java. 
		
		//**copying elements from a Set to a List (just do the opposite to convert a list to a set)
		List<String> list = new ArrayList<>();
		list.addAll(set3);
		System.out.println(list);
		
		//copying elements from a list to a set 
		List<String> dummyList = new ArrayList<>();
		Set<String> dummySet = new HashSet<>();
		dummySet.addAll(dummyList);
		
		//OR
		
		List<String> dummyList2 = new ArrayList<>();
		Set<String> dummySet2 = new HashSet<>(dummyList2); //through constructor, while instantiating
		
		///////////////////////////////////////////////////////////////////////////
		
		Set<String> myLinkedHashSet = new LinkedHashSet<>(); 
		// maintains insertion order of elements
		// doesn't maintain natural order of elements
		// almost as fast as a Hash-Set
		// Faster than a Tree-Set
		
	}

}
