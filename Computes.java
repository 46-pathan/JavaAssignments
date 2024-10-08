package stringassignments;

import java.util.Scanner;

//Write a Java program that accepts an integer (n) and computes the value of 
//n+nn+nnn. Input number: 5 
//5 + 55 + 555 

public class Computes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int nn=Integer.parseInt(""+n+n);
		int nnn=Integer.parseInt(""+n+n+n);
		int result=n+nn+nnn;
		System.out.println("calculation :\n"+n+"+"+n+""+n+"+"+n+""+n+""+n+"="+result);
	}

}
