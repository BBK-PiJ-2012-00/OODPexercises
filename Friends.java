/**
 * Q12
 */
package week2;

import javax.swing.JOptionPane;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

/**
 * @author Anna Taylor
 *
 */
public class Friends {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<String, Set<String>> friends = new HashMap<String, Set<String>>(); 
		
		Set<String> sueFriends = new HashSet<String>();
		sueFriends.add("Bob");
		sueFriends.add("Jose");
		sueFriends.add("Alex");
		sueFriends.add("Cathy");
		friends.put("Sue", sueFriends);
		
		Set<String> cathyFriends = new HashSet<String>();
		cathyFriends.add("Bob");
		cathyFriends.add("Alex");
		friends.put("Cathy", cathyFriends);
	
		Set<String> bobFriends = new HashSet<String>();
		bobFriends.add("Alex");
		bobFriends.add("Jose");
		bobFriends.add("Jerry");
		friends.put("Bob", bobFriends);
				
		String name = JOptionPane.showInputDialog("Please enter a name");
		if (friends.containsKey(name)) {
			System.out.println(name + "\'s friends are:");
			Set<String> foundFriends = friends.get(name);
			for (String s : foundFriends) {
				System.out.println(s);
			}
		}
		else {
			System.out.println("No one with that name was found.");
		}
		
		

	}

}

/**
Write a program that stores the following information in a HashMap:
Sue is friends with Bob, Jose, Alex, and Cathy Cathy is friends with 
Bob and Alex Bob is friends with Alex, Jose, and Jerry
After storing the information, prompt the user to enter a name. If the 
name that is entered is Sue, Cathy, or Bob, print out the name and the list 
of friends. Otherwise print a message indicating that the name is not in the HashMap.
*/
