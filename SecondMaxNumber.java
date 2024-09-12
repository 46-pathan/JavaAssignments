package arrayassignments;

//Write a java program to find out the 2nd max number from given array using 
//function.

public class SecondMaxNumber {

	public static void main(String[] args) {
		int[] arr= {11,1,3,6,3,0,13,9};
		int result=secondMax(arr);
		System.out.println("Second Max Number in array is : "+result);
		
	}
	static int secondMax(int[] arr) {
		int maxNumber=0;
		int secondMax=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxNumber) {
				secondMax=maxNumber;
				maxNumber=arr[i];
			}else {
				if(arr[i]>secondMax) {
					secondMax=arr[i];
				}
			}
		}
		return secondMax;
	}
}
