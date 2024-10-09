package collectionassignments;

import java.util.HashMap;

//Write a Java program to check whether a map contains key-value mappings (empty) 
//or not. 

public class IsEmptyHashMap {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		
		map.put("Red", 1);
		map.put("Blue", 2);
		map.put("Green", 3);
		map.put("Yellow", 4);
		
		System.out.println(map.isEmpty()?"Map is Empty":"Map is Not Emptry");

	}

}
