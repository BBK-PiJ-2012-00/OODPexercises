/**
 * 
 */
package week2;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Anna Taylor
 *
 */
public class TreeSetRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> treeSet = new TreeSet<String>();
		
		treeSet.add("iii");
		treeSet.add("hhh");
		treeSet.add("ggg");
		treeSet.add("fff");
		treeSet.add("eee");
		treeSet.add("ddd");
		treeSet.add("ccc");
		treeSet.add("bbb");
		treeSet.add("aaa"); 
		treeSet.add("iii");
		treeSet.add("hhh");
		treeSet.add("ggg");
		treeSet.add("fff");
		treeSet.add("eee");
		treeSet.add("ddd");
		treeSet.add("ccc");
		treeSet.add("bbb");
		treeSet.add("aaa"); 
		
		for (String s : treeSet) {
			System.out.println(s);
		}

	}

}

//Ignores duplicates, and orders elements.

/**
3. Write a class called TreeSetRunner with a main method that instantiates a TreeSet<String> object. Add the following strings to the tree set in order:
iii, hhh, ggg, fff, eee, ddd, ccc, bbb, aaa, iii, hhh, ggg, fff, eee, ddd, ccc, bbb, aaa,
(for the comma replace with a newline) Notice that each string appears twice. After adding all the strings, use an enhanced for
loop to walk sequentially through the tree set, printing each String that is encountered. How many times does each string appear in the tree set?
Are the strings in the tree set printed in the same order that they were added?
*/