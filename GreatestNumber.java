package basicassignments;
import java.util.*;
public class GreatestNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int number1,number2,number3;
		
		System.out.println("Enter three numbers");
		number1=sc.nextInt();
		number2=sc.nextInt();
		number3=sc.nextInt();
		
		int greatestnumber=number1;
		if(number2>greatestnumber) {
			greatestnumber=number2>number3?number2:number3;
		}else {
			greatestnumber=number1>number3?number1:number3;
		}
		System.out.println("Greatest Number is : "+greatestnumber);
		
	}

}
