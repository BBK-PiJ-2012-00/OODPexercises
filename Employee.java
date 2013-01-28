/**
 * Q12
 */
package week2;

/**
 * @author Anna Taylor
 *
 */
public class Employee {
	private long id;
	private String name;
	private String phoneNo;
	private String jobTitle;
	
	public Employee(long id, String name, String phoneNo, String jobTitle) {
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.jobTitle = jobTitle;
	}
	
	public boolean equals(Object otherObject) {
		Employee other = (Employee) otherObject;
		if (other.getId() == this.id && other.getName().equals(this.name) && other.getJobTitle().equals(this.jobTitle)) {
			return true;
		}
		return false;		
	}
	
	public int hashCode() {
		int h1 = (new Long(id).hashCode());
		int h2 = this.name.hashCode();
		int h3 = this.jobTitle.hashCode();
		int h4 = this.phoneNo.hashCode();
		
		final int HASH_MULTIPLIER = 31;
		int h = HASH_MULTIPLIER * h1 + h2;
		h = HASH_MULTIPLIER * h + h3;
		h = HASH_MULTIPLIER * h + h4;
		return h;
	}

	public long getId() {
		return this.id;		
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPhoneNo() {
		return this.phoneNo;
	}
	
	public String getJobTitle() {
		return this.jobTitle;
	}
	
	public String toString() {
		return "Name: " + this.name + "\n ID: " + this.id + "\n Job Title: " + this.jobTitle + "\n Contact: " + this.phoneNo + "\n";
	}
	
}

/**
Now write a program that stores a set of employees in a HashSet<Employee> and prints out the elements in the set.
Try adding the same employee twice.
(c) How can you simplify the equals and hashCode methods if you know that employees are uniquely determined by their ID?
/**
 *  name, phone number, and job title of the employee
 *  public boolean equals(Object other) public int hashCode()
You should include appropriate constructor and accessor methods.
 */
