package collectionassignments;

import java.util.HashSet;

//Write a Java program to append the specified element to the end of a hash set. 

public class AppendToHashSet {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		
		set.add("Red");
		set.add("Blue");
		set.add("Green");
		
		System.out.println(set);
		
		set.add("Yellow");
		System.out.println(set);

	}

}
