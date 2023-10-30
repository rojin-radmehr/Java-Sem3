package classexercise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
	public void hashing() {
		Set<String> set = new HashSet<String>();
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		TreeSet<String> ts = new TreeSet<String>();
		set.add("cat");
		set.add("rat");
		set.add("bat");
		
		ts.add("apple");
		ts.add("mango");
		ts.add("orange");

		lhs.add("cat");
		lhs.add("bat");
		lhs.add("rat");

		for (String st : set) {
			System.out.println(st);
		}
		System.out.println(ts.last());
	}
}
