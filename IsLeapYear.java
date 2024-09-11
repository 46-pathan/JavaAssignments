package basicassignments;
import java.util.*;

//Write a Java program that takes a year from user and print whether that year is a leap 
//year or not. 

public class IsLeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year : ");
		
		int year=sc.nextInt();
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println("It is Leap Year");
				}
				else {
					System.out.println("It is not Leap Year");
				}
			}
			else {
				System.out.println("It is Leap Year");
			}
		}
		else {
			System.out.println("It is not Leap Year");
		}

	}

}
