package collectionassignments;

import java.util.ArrayList;

//Write a Java program to remove the third element from an array list.

public class RemoveElementFromArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("Yellow");
		
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
	}

}
