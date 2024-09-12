package arrayassignments;
import java.util.*;

//Write a java program to reverse a string and check that the string is palindrome or 
//not. 

public class IsPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String here : ");
		String str=sc.next();
		String reverseStr="";
		for(int i=str.length()-1;i>=0;i--) {
			reverseStr+=str.charAt(i);
		}
		if(reverseStr.equalsIgnoreCase(str)) {
			System.out.println("It is a palindrome.");
		}else {
			System.out.println("It is a not palindrome.");		
		}

	}

}
