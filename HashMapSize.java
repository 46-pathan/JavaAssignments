package collectionassignments;

import java.util.HashMap;

//Write a Java program to count the number of key-value (size) mappings in a map. 

public class HashMapSize {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		
		map.put("Red", 1);
		map.put("Blue", 2);
		map.put("Green", 3);
		map.put("Yellow", 4);
		
		System.out.println("Size : "+map.size());
	}

}
