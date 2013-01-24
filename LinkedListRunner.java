package week2;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListRunner {
	private static List<String> list;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		list = new LinkedList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		list.add("fff");
		list.add("ggg");
		list.add("hhh");
		list.add("iii"); 
				
		ListIterator<String> iterator = list.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		while (iterator.hasPrevious()){
			String s = iterator.previous();
			if (s.equals("aaa") || s.equals("eee") || s.equals("iii")) {
				String t = s;
				if (iterator.hasPrevious()) { //solves borderline case - "aaa" at front of list
					s = iterator.previous();
					list.remove(t); 
					System.out.println(s);
					iterator = list.listIterator();//when iterator is 'reset', it starts at the beginning once more
					while (iterator.hasNext()) {
						iterator.next(); //move back to the end
					}				
				}
				else {
					list.remove(t); 
					iterator = list.listIterator();//when iterator is 'reset', it starts at the beginning once more
					while (iterator.hasNext()) {
						iterator.next(); //move back to the end
					}			;
				}				
			}
			else {
				System.out.println(s);
			}	

		}
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}


/**
Write a class called LinkedListRunner with a main method that instantiates a
LinkedList<String>. Add the following strings to the linked list:
aaa, bbb, ccc, ddd, eee, fff, ggg, hhh, iii
(for the comma replace with a newline)
(b) Write a ListIterator<String> and use it to walk sequentially through the linked
list using hasNext and next, printing each string that is encountered. When you
have printed all the strings in the list, use the hasPrevious and previous methods
to walk backwards through the list.
Along the way, examine each string and remove all the strings that begin with a
vowel.
When you arrive at the beginning of the list, use hasNext and next to go forward
again, printing out each string that remains in the linked list.
*/