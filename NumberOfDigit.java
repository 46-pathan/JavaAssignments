package basicassignments;
import java.util.*;

//Write a Java program that reads a positive integer and count the number of digits 
//the number. 
//Input an integer number less than ten billion: 125463 
//Number of digits in the number: 6 

public class NumberOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input an integer number less than ten billion :");
		
		long number=sc.nextLong();
		int count=0;

		if(number>=0&&number<=10000000000L) {
			while(number!=0) {
				number=number/10;
				count++;
			}
			System.out.println("Number of digits in the number : "+count);
		}else {
			System.out.println("Not valid");
		}
		
			
	}

}
