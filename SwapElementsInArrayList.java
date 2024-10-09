package collectionassignments;

import java.util.ArrayList;
import java.util.Collections;

//Write a Java program of swap two elements in an array list. 

public class SwapElementsInArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("Yellow");
		
		System.out.println(list);

		Collections.swap(list, 1, 3);
		System.out.println(list);
	}

}
