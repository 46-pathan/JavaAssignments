package collectionassignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//Write a Java program to convert a hash set to a List/Array List. 

public class HashSetToList {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		
		set.add("Red");
		set.add("Blue");
		set.add("Green");
		set.add("Yellow");
		
		List<String> list=new ArrayList<>(set);
		System.out.println(list);
	}

}
