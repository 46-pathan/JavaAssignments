package collectionassignments;

import java.util.HashSet;
import java.util.Iterator;

//Write a Java program to iterate through all elements in a hash list.

public class IteratorHashSet {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		
		set.add("Red");
		set.add("Blue");
		set.add("Green");
		set.add("Yellow");
		
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
