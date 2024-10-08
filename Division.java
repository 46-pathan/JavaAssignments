package exceptionassignments;

import java.util.Scanner;

//W.A.J. P to demonstrate try catch block, Take two numbers from the user and perform the division operation 
//and handle 
//Arithmetic Exception. O/P- Enter two numbers: 10 0 
//Exception in thread main java.lang.ArithmeticException:/ by zero 

public class  Division{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter two numbers:");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int result=a/b;
			System.out.println("Result : "+result);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}

	}

}
