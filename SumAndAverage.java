package basicassignments;
import java.util.*;

//Write a program in Java to input 5 numbers from keyboard and find their sum and 
//average using for loop. 

public class SumAndAverage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Double sum=0.0;
		Double average;
		Double number;
		System.out.println("Enter your numbers here: ");
		for(int i=0;i<5;i++) {
			number=sc.nextDouble();
			sum=sum+number;		
		}
		average=sum/5;
		System.out.println("Sum of five number is :"+sum);
		System.out.println("Average of five number is :"+average);

	}

}
