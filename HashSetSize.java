package collectionassignments;

import java.util.HashSet;

//Write a Java program to get the number of elements in a hash set. 

public class HashSetSize {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		
		set.add("Red");
		set.add("Blue");
		set.add("Green");
		set.add("Yellow");
		
		System.out.println("Size : "+set.size());
	}

}
