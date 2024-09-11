package basicassignments;
import java.util.*;

// Write a Java program that takes the user to provide a single character from the 
//alphabet. Print Vowel or Consonant, depending on the user input. If the user input 
//is not a letter (between a and z or A and Z), or is a string of length > 1, print an error 
//message.

public class IsCharacter {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character : ");
		String c=sc.next();
		
		char ch=c.charAt(0);
		
		if(c.length()>1) {
			System.out.println("Only single character");
			return;
		}
		
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				System.out.println("This character is Vowel");
			}
			
			else {
				System.out.println("This character is Consonant");
			}
		}
		
		else {
			System.out.println("Invalid input");
		}

	}

}
