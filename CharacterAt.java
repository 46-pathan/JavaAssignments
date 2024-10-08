package stringassignments;

import java.util.Scanner;

//W.A.J.P to get the character at the given index within the String. Original String = 
//Tops Technologies! The character at position 0 is T, The character at position 10 is 
//o 

public class CharacterAt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="Tops Technologies";
		System.out.println("Enter index no");
		int n=sc.nextInt();
		if(n>=0 && n<str.length()) {
			char c=str.charAt(n);
			System.out.println("Character At index "+n+" is "+c);
		}else {
			System.out.println("Index out of range");
		}

	}

}
