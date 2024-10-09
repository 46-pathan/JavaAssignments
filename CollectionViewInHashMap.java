package collectionassignments;

import java.util.Collection;
import java.util.HashMap;

//Write a Java program to get a collection view of the values contained in this map. 

public class CollectionViewInHashMap {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		
		map.put("Red", 1);
		map.put("Blue", 2);
		map.put("Green", 3);
		map.put("Yellow", 4);
		
		Collection<Integer> values=map.values();
		System.out.println(values);

	}

}
