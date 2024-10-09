package collectionassignments;

import java.util.ArrayList;

//Write a Java program to update specific array element by given element.

public class UpdateSpecificElementInArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("Yellow");
		
		System.out.println(list);
		
		list.set(2, "Purple");
		System.out.println(list);
	}

}
