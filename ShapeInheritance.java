package oopsassignments;

//Create a class named 'Shape' with a method to print "This is this is shape". Then 
//create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both 
//having a method to print "This is rectangular shape" and "This is circular shape" 
//respectively. Create a subclass 'Square' of 'Rectangle' having a method to print 
//"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the 
//object of 'Square' class.

class Shape2{
	void printShape() {
		System.out.println("This is Shape");
	}
}

class Rectangle2 extends Shape2{
	void printRectangle() {
		System.out.println("This is Rectangle shape");
	}
}
class Circle2 extends Shape2{
	void printCircle() {
		System.out.println("This is Circle shape");
	}
}
class Square2 extends Rectangle2{
	void printSquare() {
		System.out.println("Square is Rectangle");
	}
}

public class ShapeInheritance {

	public static void main(String[] args) {
		Square2 s=new Square2();
		s.printShape();
		s.printRectangle();
		s.printSquare();
	}

}
