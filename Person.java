/**
 * Week2 Exercises: Q4
 */
package week2;

/**
 * @author Anna Taylor
 *
 */
public class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	
	public String toString() { //for printing meaningful details rather than memory address
		return "Name: " + firstName + " " + lastName + "\n";
	}
	
	
	@Override
	public int compareTo(Person person) {
		String fullName = lastName + firstName;
		String candidateFullName = person.lastName + person.firstName;
		return fullName.compareTo(candidateFullName);//invokes compareTo() of String
	}
	

}


