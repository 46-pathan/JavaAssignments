package collectionassignments;

import java.util.ArrayList;

//Write a Java program to insert an element into the array list at the first position. 

public class AddAtFirstPositionArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("Yellow");
		System.out.println(list);
		list.add(0,"Purple");
		System.out.println(list);

	}

}
