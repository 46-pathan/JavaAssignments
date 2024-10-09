package collectionassignments;

import java.util.HashMap;

//Write a Java program to associate the specified value with the specified key in a 
//Hash Map. 

public class AddInHashMap {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		
		map.put("Red", 1);
		map.put("Blue", 2);
		map.put("Green", 3);
		map.put("Yellow", 4);
		
		System.out.println(map);
	}

}
