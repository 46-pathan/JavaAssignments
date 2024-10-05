package oopsassignments;

import java.util.Scanner;

//Write a program which will ask the user to enter his/her marks (out of 100). Define a 
//method that will display grades according to the marks entered as below: 
//Marks Grade : 
//1-100 A 
//1-90 B 
//1-80 B 
//1-70 C 
//1-60 D 
//41-50 DD40  Fail 

public class MarksAndGrade {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks : ");
		int marks=sc.nextInt();
		String grade;
		if(marks>90 && marks<=100) {
			grade="A";
		}else if(marks>80) {
			grade="B";
		}else if(marks>70) {
			grade="B";
		}else if(marks>60) {
			grade="C";
		}else if(marks>50) {
			grade="D";
		}else if(marks>40) {
			grade="DD";
		}else {
			grade="Fail";
		}
		System.out.println("Your grade : "+grade);
		

	}

}
