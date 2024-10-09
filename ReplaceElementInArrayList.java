package collectionassignments;

import java.util.ArrayList;

//Write a Java program to replace the second element of an Array List with the 
//specified element. 

public class ReplaceElementInArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		
		System.out.println(list);
		list.set(1,"Yellow");
		System.out.println(list);

	}

}
