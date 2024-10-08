package exceptionassignments;

//W.A.J. P to demonstrate try catch block, take two numbers from the user by 
//Command line argument and perform the division operation and handle Arithmetic 
//O/P- 
//Exception in thread main java. Lang. Arithmetic Exception:/ by zero 

public class DivisionCommandLine {

	public static void main(String[] args) {
		try {
			int n1=Integer.parseInt(args[0]);
			int n2=Integer.parseInt(args[1]);
			int result=n1/n2;
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println(e);
		
		}
	}
}
