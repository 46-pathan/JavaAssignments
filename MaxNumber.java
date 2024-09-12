package arrayassignments;

//Write a java program to find out the max number from given array using function 

public class MaxNumber {

	public static void main(String[] args) {
		int[] arr= {11,2,13,5,9,20,0};
		int result=max(arr);
		System.out.println("Max number in array is : "+result);
		
	}
	
	static int max(int[] arr) {
		int maxNumber=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxNumber) {
				maxNumber=arr[i];
			}
		}
		return maxNumber;
	}

}
