package listsInJava;

import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		
		// Linked List - is a data structure that stores a series of nodes (data + address), in 
		// non-consecutive memory locations. Elements are linked using pointers. 
		
		 
		/*
		 * 
		 * Advantages:
		 * 
		 * 1) Dynamic Data Structure (allocates needed memory while running)
		 * 2) Insertion and deletion of nodes is easy - O(1)
		 * 3) No/low memory wasted
		 * 
		 * Disadvantages: 
		 * 
		 * 1) greater memory usage (additional pointer)
		 * 2) no random access of elements (no index [i])
		 * 3) Accessing/searching elements is more time consuming - O(n)
		 *    
		 * Uses:
		 * 
		 * 1) Implement Stacks/Queues
		 * 2) GPS navigation
		 * 3) Music play-list
		 * 
		 * */

		LinkedList<String> linkedList = new LinkedList<>();
		
		// treating as a Stack
		/*
		linkedList.push("A");
		linkedList.push("B"); // B will be added on top of A
		linkedList.push("C");
		linkedList.push("D");
		linkedList.push("F");
		
		linkedList.pop(); // tail or last element added (F) will be deleted (output - [D, C, B, A])
		*/
		// treating as a queue
		
		linkedList.offer("A");
		linkedList.offer("B"); // B will be added after A
		linkedList.offer("C");
		linkedList.offer("D");
		linkedList.offer("F");
		
		//linkedList.poll(); // deletes the head or first element (A) of the list (output - [B, C, D, F])
		
		linkedList.add(4, "E");
		linkedList.remove("E");
		System.out.println(linkedList.indexOf("F"));
		
		
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		
		linkedList.addFirst("0");
		linkedList.addLast("G");
		
		linkedList.removeFirst();
		linkedList.removeLast();
		
		
		
		System.out.println(linkedList);
		
	}

}
