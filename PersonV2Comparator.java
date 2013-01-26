/**
 * 
 */
package week2;

import java.util.Comparator;

/**
 * @author Anna Taylor
 *
 */
public class PersonV2Comparator implements Comparator<PersonV2> {
	
	public int compare(PersonV2 p1, PersonV2 p2) {
		String p1Name = p1.getLastName() + p1.getFirstName();
		String p2Name = p2.getLastName() + p2.getFirstName();
		return p1Name.compareTo(p2Name);
	}

}
