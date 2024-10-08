package stringassignments;

//Create a class named 'Print Number' to print various numbers of different data types 
//by creating different methods with the same name 'printn' having a parameter for 
//each data type. 

public class PrintNumber {
	
	void printn(int n) {
		System.out.println("Integer : "+n);
	}
	
	void printn(double n) {
		System.out.println("Double : "+n);
	}
	
	void printn(float n) {
		System.out.println("Float : "+n);
	}
	
	void printn(long n) {
		System.out.println("Long : "+n);
	}
	
	void printn(short n) {
		System.out.println("Short : "+n);
	}
	
	void printn(byte n) {
		System.out.println("Byte : "+n);
	}
	
	void printn(boolean b) {
		System.out.println("Boolean : "+b);
	}
	
	void printn(char c) {
		System.out.println("Character : "+c);
	}

	public static void main(String[] args) {		
		PrintNumber obj=new PrintNumber();
		
		obj.printn(42);
		obj.printn(3.14);
		obj.printn(2.71f);
		obj.printn(123456789L);
		obj.printn((short)123);
		obj.printn((byte)127);
		obj.printn(true);
		obj.printn('A');
	}

}
