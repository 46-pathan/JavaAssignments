package exceptionassignments;

//W.A.J.P to create the validate method that takes integer value as a parameter. If the 
//age is less than 18, then throw an Arithmetic Exception otherwise print a message 
//welcome to vote. 
//O/P- Enter your age: 16 
//Exception in thread main java. Lang. Arithmetic Exception: not valid 

public class AgeValidation {
	
	static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Not Valid");
		}else {
			System.out.println("Welcome to vote");
		}
	}

	public static void main(String[] args) {
		int age=16;
		try {
			validate(age);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		
	}

}
