package collectionassignments;

import java.util.HashSet;

//Write a Java program to compare two sets and retain elements which are same on 
//both sets. 

public class CompareTwoHashSet {

	public static void main(String[] args) {
		HashSet<String> set1=new HashSet<>();
		
		set1.add("Red");
		set1.add("Blue");
		set1.add("Green");
		
		HashSet<String> set2=new HashSet<>();
		
		set2.add("Red");
		set2.add("Blue");
		set2.add("Yellow");
		
		System.out.println(set1);
		System.out.println(set2);
		set1.retainAll(set2);
		System.out.println(set1);

	}

}
