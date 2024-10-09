package collectionassignments;

import java.util.ArrayList;

//Write a Java program to print all the elements of an Array List using the position of 
//the elements. 

public class PrintByIndexInArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("Yellow");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(i+" : "+list.get(i));
		}

	}

}
