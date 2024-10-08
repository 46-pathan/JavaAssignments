package stringassignments;

import java.util.Scanner;

//Write a Java program to print the ASCII value of a given character. 

public class ASCIIValueConvert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character: ");
		String str=sc.next();
		if(str.length()!=1) {
			System.out.println("Not valid");
			return;
		}
		char cr=str.charAt(0);
		int value=cr;
		System.out.println("Value is :"+value);
	}

}
