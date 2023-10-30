package classexercise;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public void linkedList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(1, 500);
//		list.removeFirst(); removes and returns the first element
//		list.removeAll(list);
		Iterator<Integer> i = list.iterator();
		System.out.println("Linked List: ");
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
