package exceptionassignments;

//W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch 
//block. try { 
//try 
//{//code} 
//catch (Exception e) 
//{//code} 
//catch (Exception e) 
//{//code} 

public class NestedTryCatch {

	public static void main(String[] args) {
		try {
			try {
				int[] a=new int[5];
				a[5]=30/2;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}catch(ArithmeticException e) {
			System.out.println(e);
		}

	}

}
