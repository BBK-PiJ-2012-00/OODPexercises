/**
 * 
 */
package week2;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anna Taylor
 *
 */
public class EmployeePrinter {
	private Set<Employee> employees = new HashSet<Employee>();
	
	private void printEmployees() {
		System.out.print(employees);
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EmployeePrinter ep = new EmployeePrinter();
		ep.launch();
	}
	
	private void launch() {
		
		Employee tseng = new Employee(001, "Tseng", "777-123", "Turk Director" );
		Employee reno = new Employee(002, "Reno", "777-441", "Professional Whinger");
		Employee rude = new Employee(003, "Rude", "777-290", "Turk");
		Employee elena = new Employee(004, "Elena", "777-331", "Turk");
		
		employees.add(tseng);
		employees.add(reno);
		employees.add(rude);
		employees.add(elena);
		employees.add(tseng);	
		
		printEmployees();
		

	}

}



/**
Now write a program that stores a set of employees in a HashSet<Employee> and prints out the elements in the set.
Try adding the same employee twice.
(c) How can you simplify the equals and hashCode methods if you know that employees are uniquely determined by their ID?
*/