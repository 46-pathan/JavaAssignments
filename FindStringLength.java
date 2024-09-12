package arrayassignments;
import java.util.*;

//Write a java program Find out length of string without using inbuilt function 

public class FindStringLength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String here : ");
		String str=sc.nextLine();
		int count=0;
		for(char c:str.toCharArray()) {
			count++;
		}
		System.out.println("Length of String is : "+count);	

	}

}
