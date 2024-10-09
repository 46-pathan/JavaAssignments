package collectionassignments;

import java.util.ArrayList;

//Write a Java program to create a new array list, add some 
//colors (string) and print out the collection.

public class ColorArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("Yellow");
		
		System.out.println(list);

	}

}
