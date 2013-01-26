/**
 * Q4
 */
package week2;

import java.util.TreeSet;

/**
 * @author Anna Taylor
 *
 */
public class PersonRunner {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TreeSet<Person> mySet = new TreeSet<Person>();
		
		mySet.add(new Person("Sally", "Brown"));
		mySet.add(new Person("Fred", "Kelly"));
		mySet.add(new Person("Bill", "Akins"));
		mySet.add(new Person("Julie", "Wilkins"));
		mySet.add(new Person("James", "Langdon"));
		
		for (Person p : mySet) {
			System.out.print(p);//toString method prevents memory address being printed
		}

	}

}
