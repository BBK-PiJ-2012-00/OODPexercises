package week2;

import java.util.PriorityQueue;
import java.util.Queue;

public class PersonQueue {
	Queue<Person> priorityQueue = new PriorityQueue<Person>();
	
	
	public static void main(String[] args) {
		
		PersonQueue pq = new PersonQueue();
		pq.launch();
		
	}
	
	private void launch() {
		
		Person sam = new Person("Sam", "Smith");
		Person charlie = new Person("Charlie", "Black");
		Person betty = new Person("Betty", "Brown");
		Person jessica = new Person("Jessica", "Stewart");
		Person john = new Person("John", "Friday");
		Person frank = new Person("Frank", "Foley");
		
		priorityQueue.add(sam);
		priorityQueue.add(charlie);
		priorityQueue.add(betty);
		priorityQueue.add(jessica);
		priorityQueue.add(john);
		priorityQueue.add(frank);
		
		while (!priorityQueue.isEmpty()) {
			Person p = priorityQueue.poll();
			System.out.println(p);
		}
		
		
		

	}

}



/**
Use this class to create Person objects for each of the names below, and add them to a
PriorityQueue<Person> object.
Empty the queue by polling it and printing the Person objects that are returned.
Are Person objects returned in sequence? YES

*/