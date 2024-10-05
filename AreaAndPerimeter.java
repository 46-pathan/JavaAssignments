package oopsassignments;

//Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
//two methods to print the area and perimeter of the rectangle respectively. Its 
//constructor having parameters for length and breadth is used to initialize the length 
//and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its 
//constructor having a parameter for its side (suppose s) calling the constructor of its 
//parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square. 


class Rectangle{
	double length;
	double breadth;
	Rectangle(double l,double b){
		length=l;
		breadth=b;
	}
	
	void printPerimeter() {
		System.out.println("Rectangle Perimeter is : "+(2*(length+breadth)));
	}
	
	void printArea() {
		System.out.println("Rectangle Area is : "+(length*breadth));
	}
}

class Square extends Rectangle{
	double side;
	Square(double s){
		super(s,s);
		side=s;
	}
	
	void printPerimeter() {
		System.out.println("Square Perimeter is : "+(4*side));
	}
	
	void printArea() {
		System.out.println("Square Area is : "+Math.pow(side, 2));
	}
	
}

public class AreaAndPerimeter {

	public static void main(String[] args) {
		Rectangle box1=new Rectangle(3,4);
		box1.printPerimeter();
		box1.printArea();
		
		System.out.println();
		
		Square box2=new Square(4);
		box2.printPerimeter();
		box2.printArea();

	}

}
