package arrayassignments;

import java.util.Scanner;

//Write a java program to make addition, Subtraction and multiplication of two 
//matrix using 2-D Array 

public class OprationOnTwoMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of rows : ");
		int rows=sc.nextInt();
		System.out.println("Enter number of columns : ");
		int cols=sc.nextInt();
		
		int[][] matrix1=new int[rows][cols];
		int[][] matrix2=new int[rows][cols];
		int[][] result=new int[rows][cols];
		
		System.out.println("Enter numbers for matrix 1 : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter numbers for matrix 2 : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix2[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Addition on two matrix :");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				result[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		printMatrix(result);
		
		System.out.println("Subtraction on two matrix :");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				result[i][j]=matrix1[i][j]-matrix2[i][j];
			}
		}
		printMatrix(result);
		
		System.out.println("Multiplication on two matrix :");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				result[i][j]=0;
				for(int k=0;k<rows;k++) {
					result[i][j]+=matrix1[i][k]*matrix2[k][j];
				}
			}
		}
		printMatrix(result);
		
	}
	
	static void printMatrix(int[][] arr) {
		for(int[] a:arr) {
			for(int b:a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
}
