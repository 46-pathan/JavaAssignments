package collectionassignments;

import java.util.ArrayList;

//Write a Java program to join two array lists. 

public class JoinTwoArrayList {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<>();
		
		list1.add("Red");
		list1.add("Blue");
		list1.add("Green");
		
		ArrayList<String> list2=new ArrayList<>();
		
		list2.add("Yellow");
		list2.add("Purple");
		list2.add("Black");
		
		System.out.println(list1);
		System.out.println(list2);
		
		ArrayList<String> list=new ArrayList<>(list1);
		list.addAll(list2);
		System.out.println(list);
		
	}

}
