package oopsassignments;

//Create a class to print the area of a square and a rectangle. The class has two methods 
//with the same name but different number of parameters. The method for printing 
//area of a rectangle has two parameters which are length and breadth respectively 
//while the other method for printing area of square has one parameter which is side 
//of square. 

class A{
	void printA() {
		System.out.println("This is a parent class");
	}
}

class B extends A{
	void printB() {
		System.out.println("This is a child class");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
		A obja=new A();
		obja.printA();
		
		B objb=new B();
		objb.printB();
		objb.printA();
		
	}

}
