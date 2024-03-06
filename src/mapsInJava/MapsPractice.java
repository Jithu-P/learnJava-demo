package mapsInJava;

import java.util.HashMap;
import java.util.Map;

public class MapsPractice {

	public static void main(String[] args) {

		/* Working, but not recommended
		Map map = new HashMap();
		
		map.put("John", 123);
		map.put('@', "ID");
		
		System.out.println(map);
		*/
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("John", 123);
		map.put("Adam", 321);
		map.put("Mary", 456);
		map.put("Cole", 654);
		
		System.out.println(map);
		System.out.println(map.get("Adam"));
		//System.out.println(map.get(456)); // output - null; cannot get key using value
		
		map.containsKey("Mary");
		map.containsValue(654);
		
		map.put("John", 789); // overrides the previous value
		System.out.println(map);
		
		map.put("Jacob", 789);
		System.out.println(map); // adds new key with the same value
		
		//**
		map.replace("John", 777); //replaces the value for the key 'John'
		System.out.println(map);
		//difference between put and replace:
		// map.put("Michael", 000); -> will create new key-value pair
		// map.replace("Michael", 000) -> won't do anything since that key doesn't exist;
		
		map.putIfAbsent("John", 888); // no change
		map.putIfAbsent("Bond", 007); // creates new record
		
		map.remove("Bond");
		
	}

}
