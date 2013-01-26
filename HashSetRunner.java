package week2;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetRunner {
	private static Set<String> hashSet = new HashSet<String>();
	
	public static void main(String[] args) {		
		
		hashSet.add("aaa");
		hashSet.add("bbb");
		hashSet.add("ccc");
		hashSet.add("ddd");
		hashSet.add("eee");
		hashSet.add("fff");
		hashSet.add("ggg");
		hashSet.add("hhh");
		hashSet.add("iii"); 
		hashSet.add("aaa");
		hashSet.add("bbb");
		hashSet.add("ccc");
		hashSet.add("ddd");
		hashSet.add("eee");
		hashSet.add("fff");
		hashSet.add("ggg");
		hashSet.add("hhh");
		hashSet.add("iii"); 
		
		Iterator<String> iterator = hashSet.iterator();
		
		for (String s : hashSet) {
			System.out.println(s);
		}

	}

}

//No duplicates are added to sets, hence each string appears only once, and the order isn't important (and thus isn't retained).

/**
WriteaclasscalledHashedSetRunnerwithamainmethodthatinstantiatesaHashedSet<String>. Add the following strings to the linked hashSet:
aaa, bbb, ccc, ddd, eee, fff, ggg, hhh, iii, aaa, bbb, ccc, ddd, eee, fff, ggg, hhh, iii
(for the comma replace with a newline)
Notice that each string appears twice. After adding all the strings, use an enhanced for loop to walk sequentially through the hash set, 
printing each string that is encountered.
How many times does each string appear in the hash set? Are the strings in the hash set printed in the same order that they were added?
*/