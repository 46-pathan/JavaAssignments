package collectionassignments;

import java.util.ArrayList;

//Write a Java program to retrieve an element (at a spec. index) from a given array list. 

public class RetriveElementFromArrayListAtIndex {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("Yellow");
		
		System.out.println("Element at index 2 :"+list.get(2));

	}

}
