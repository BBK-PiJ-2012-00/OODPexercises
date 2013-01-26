/**
 * Q5
 */
package week2;

/**
 * @author Anna Taylor
 *
 */
public class PersonV2 {
	private String firstName;
	private String lastName;
	
	public PersonV2(String firstName, String lastName) {
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

}
