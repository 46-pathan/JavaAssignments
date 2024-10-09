package collectionassignments;

import java.util.ArrayList;
import java.util.Collections;

//Write a Java program to copy one array list into another. 

public class CopyArrayListToOther {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("Yellow");
		
		ArrayList<String> copylist=new ArrayList<>(list.size());
		
		for(int i=0;i<list.size();i++) {
			copylist.add(null);
		}
		
		Collections.copy(copylist, list);
		System.out.println(list);
		System.out.println(copylist);
	}

}
