package collectionassignments;

import java.util.ArrayList;

//Write a Java program to compare two array lists. 

public class CompareTwoArrayLists {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<>();
		
		list1.add("Red");
		list1.add("Blue");
		list1.add("Green");
		
		ArrayList<String> list2=new ArrayList<>();
		
		list2.add("Red");
		list2.add("Blue");
		list2.add("Yellow");
		
		if(list1.equals(list2)) {
			System.out.println("List are equal");
		}else {
			System.out.println("List are not equal");
		}
	}

}
