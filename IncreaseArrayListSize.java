package collectionassignments;

import java.util.ArrayList;

//Write a Java program to increase the size of an array list. 

public class IncreaseArrayListSize {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>(2);
		
		list.add("Red");
		list.add("Blue");
		System.out.println(list);
		list.add("Green");
		list.add("Yellow");
		System.out.println(list);
		

	}

}
