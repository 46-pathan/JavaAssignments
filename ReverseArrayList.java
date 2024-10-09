package collectionassignments;

import java.util.ArrayList;
import java.util.Collections;

//Write a Java program to reverse elements in an array list. 

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("Yellow");
		
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
	}

}
