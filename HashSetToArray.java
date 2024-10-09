package collectionassignments;

import java.util.HashSet;

//Write a Java program to convert a hash set to an array. 

public class HashSetToArray {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		
		set.add("Red");
		set.add("Blue");
		set.add("Green");
		set.add("Yellow");
		
		String[] arr=set.toArray(new String[0]);
		
		for(String s:arr) {
			System.out.println(s);
		}
	}

}
