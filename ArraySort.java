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
		
		System.out.println("Enter 1 for asceding arrays 2 for descending arrays");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:System.out.println("ascending arrays : ");
				System.out.println("Array 1 sorted : ");
				sortAscArray(arr1);
				System.out.println("\nArray 2 sorted : ");
				sortAscArray(arr2);
		break;
		case 2:System.out.println("descending arrays : ");
				System.out.println("Array 1 sorted : ");
				sortDscArray(arr1);
				System.out.println("\nArray 2 sorted : ");
				sortDscArray(arr2);
		break;
		}	
		
	}
	
	static void sortAscArray(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		printArray(arr);
	}
	
	static void sortDscArray(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		printArray(arr);
	}
	
	static void printArray(int[] arr) {
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
	}

}
