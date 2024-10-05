package oopsassignments;

//Create an abstract class 'Parent' with a method 'message'. It has two subclasses each 
//having a method with the same name 'message' that prints "This is first subclass" 
//and "This is second subclass" respectively. Call the methods 'message' by creating 
//an object for each subclass. 

abstract class Parent{
	abstract void message();
}

class SubA extends Parent{
	void message() {
		System.out.println("This is first subclass");
	}
}

class SubB extends Parent{
	void message(){
		System.out.println("This is second subclass");
	}
}

public class AbstractParent {

	public static void main(String[] args) {
		SubA obj1=new SubA();
		SubB obj2=new SubB();
		
		obj1.message();
		obj2.message();

	}

}
