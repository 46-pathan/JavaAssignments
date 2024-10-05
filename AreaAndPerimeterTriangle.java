package oopsassignments;

//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 
//5 units by creating a class named 'Triangle' without any parameter in its constructor. 

class Triangle{
	double side1;
	double side2;
	double side3;
	
	Triangle(){
		System.out.println("This is triangle");
	}
	

	void setSides(double s1,double s2,double s3) {
		side1=s1;
		side2=s2;
		side3=s3;
	}
	
	double getArea() {
		double s=(side1+side2+side3)/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-=side3));
	}
	
	double getPerimeter() {
		return (side1+side2+side3);
	}
	
	
}

public class AreaAndPerimeterTriangle {

	public static void main(String[] args) {
		
		Triangle obj=new Triangle();
		obj.setSides(3, 4, 5);
		System.out.println("Area is : "+obj.getArea());
		System.out.println("Perimeter is : "+obj.getPerimeter());
		
	}

}
