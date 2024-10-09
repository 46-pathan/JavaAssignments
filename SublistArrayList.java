package collectionassignments;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to extract a portion of an array list. 

public class SublistArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("Yellow");
		
		List<String> sublist=list.subList(1, 3);
		System.out.println(sublist);
	}

}
