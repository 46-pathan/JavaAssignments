package exceptionassignments;

//W.A.J.P to create a class Student with attributes roll no, name, age and course. 
//Initialize values through parameterized constructor. If age of student is not in 
//between 15 and 21 then generate user defined exception 
//"AgeNotWithinRangeException". If name contains numbers or special symbols 
//raise exception "NameNotValidException". Define the two exception classes. 

class AgeNotWithinRangeException extends Exception{
	AgeNotWithinRangeException(String message){
		super(message);
	}
}

class NameNotValidException extends Exception{
	NameNotValidException(String message){
		super(message);
	}
}

class Student{
	int rollNo;
	String name;
	int age;
	String course;
	 Student(int rollNo,String name,int age,String course) throws AgeNotWithinRangeException,NameNotValidException{
		 if(age<15||age>21) {
			 throw new AgeNotWithinRangeException("Age not within range");
		 }
		 if(!name.matches("[a-zA-Z]+")){
			 throw new NameNotValidException("Name not valid");
		 }
		 this.rollNo=rollNo;
		 this.name=name;
		 this.age=age;
		 this.course=course;	 
	 }
}

public class StudentValidation {

	public static void main(String[] args) {
		try {
			Student s1=new Student(1,"John12",11,"CP");
		}catch(AgeNotWithinRangeException | NameNotValidException e) {
			System.out.println(e.getMessage());
		}

	}

}
