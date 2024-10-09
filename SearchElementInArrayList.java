package collectionassignments;

import java.util.ArrayList;

//Write a Java program to search an element in an array list. 

public class SearchElementInArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("Yellow");
		
		int index=list.indexOf("Green");
		if(index!=-1) {
			System.out.println("Green is at :"+index);
		}else {
			System.out.println("Not found");
		}
	}

}
