package arrayassignments;
import java.util.*;

//Write A Java Program to take two Array input from user and sort them in 
//ascending or descending order as per user’s choice 

public class ArraySort {

	public static void main(String[] args) {
		int[] arr1,arr2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length of first array : ");
		int length1=sc.nextInt();
		arr1=new int[length1];
		
		System.out.println("Enter numbers for first array : ");
		for(int i=0;i<length1;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter length of second array : ");
		int length2=sc.nextInt();
		arr2=new int[length2];
		
		System.out.println("Enter numbers for second array : ");
		for(int i=0;i<length2;i++) {
			arr2[i]=sc.nextInt();
		}
		
	}
	
	static void swap(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
	}
	static int[] sortAscArray(int[] arr) {
		int min=0;
		for(int i=0;i<arr.length;i++) {
			min=arr[i];
			for(int j=arr[i+1];j<arr.length;j++) {
				if(min>arr[i+1]);
			}
		}
		
		return arr;
	}
	
	static int[] sortDscArray(int[] arr) {
		
		
		return arr;
	}

}
