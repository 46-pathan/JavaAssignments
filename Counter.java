package stringassignments;

import java.util.Scanner;

//Write a Java program to count the letters, spaces, numbers and other characters of 
//an input string.

public class Counter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String data=sc.nextLine();
		data=data.toLowerCase();
		int length=data.length();
		
		int letterCount=0, spacesCount=0, numbersCount=0, charactersCount=0;
		char c;
		for(int i=0;i<length;i++) {
			c=data.charAt(i);
			if(c>=97&&c<=122) {
				letterCount++;
			}else if(c==' ') {
				spacesCount++;
			}else if(c>=48&&c<=57) {
				numbersCount++;
			}else {
				charactersCount++;
			}
		}
		
		System.out.println("Letter Counts : "+letterCount);
		System.out.println("Spaces Counts : "+spacesCount);
		System.out.println("Numbers Counts : "+numbersCount);
		System.out.println("Characters Counts : "+charactersCount);
	}
}
