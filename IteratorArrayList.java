package collectionassignments;

import java.util.ArrayList;
import java.util.Iterator;

//Write a Java program to iterate through all elements in an array list. 

public class IteratorArrayList {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("Yellow");
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
