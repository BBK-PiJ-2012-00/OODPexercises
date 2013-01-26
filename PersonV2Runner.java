/**
 * Q4: alternate way of comparing using TreeSet() constructor
 */
package week2;

import java.util.TreeSet;

/**
 * @author Anna Taylor
 *
 */
public class PersonV2Runner {
	
	public static void main(String[] args) {
		
		TreeSet<PersonV2> treeSet = new TreeSet<PersonV2>(new PersonV2Comparator());
		
		treeSet.add(new PersonV2("Sally", "Brown"));
		treeSet.add(new PersonV2("Fred", "Kelly"));
		treeSet.add(new PersonV2("Bill", "Akins"));
		treeSet.add(new PersonV2("Julie", "Wilkins"));
		treeSet.add(new PersonV2("James", "Langdon"));
		
		for (PersonV2 p : treeSet) {
			System.out.print(p);
		}
	}

}
