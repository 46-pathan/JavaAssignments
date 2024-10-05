package oopsassignments;

//Print the sum, difference and product of two complex numbers by creating a class 
//named 'Complex' with separate methods for each operation whose real and 
//imaginary parts are entered by user.  

class Complex {
	double real;
	double imaginary;

	public Complex(double real,double imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	
	Complex add(Complex n) {
		return new Complex(this.real+n.real,this.imaginary+n.imaginary);
	}
	Complex sub(Complex n) {
		return new Complex(this.real-n.real,this.imaginary-n.imaginary);
	}
	Complex mul(Complex n) {
		double realpart=this.real*n.real-this.imaginary*n.imaginary;
		double imaginarypart=this.real*n.imaginary+n.real*this.imaginary;
		return new Complex(realpart,imaginarypart);
	}
	
	public String toString() {
		return this.real+" + "+this.imaginary+"i";
	}
}

public class ComplexNumberOp {

	public static void main(String[] args) {
		
		Complex com1=new Complex(4,5);
		Complex com2=new Complex(2,3);
			
		System.out.println("Sum : "+com1.add(com2));
		System.out.println("Sub : "+com1.sub(com2));
		System.out.println("mul : "+com1.mul(com2));

	}

}
