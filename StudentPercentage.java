package oopsassignments;


abstract class Marks{
	abstract double getPercentage();
}

class StuA extends Marks{
	double subject1,subject2,subject3;
	StuA(double subject1,double subject2,double subject3){
		this.subject1=subject1;
		this.subject2=subject2;
		this.subject3=subject3;
	}
	
	double getPercentage() {
		return (subject1+subject2+subject3)/3;
	}
}

class StuB extends Marks{
	double subject1,subject2,subject3,subject4;
	StuB(double subject1,double subject2,double subject3,double subject4){
		this.subject1=subject1;
		this.subject2=subject2;
		this.subject3=subject3;
		this.subject4=subject4;
	}
	
	double getPercentage() {
		return (subject1+subject2+subject3+subject4)/4;
	}
}

public class StudentPercentage {

	public static void main(String[] args) {
		StuA studentA=new StuA(85,67,89);
		StuB studentB=new StuB(43,75,87,65);
		
		System.out.println("Percentage of Student A: "+studentA.getPercentage()+"%");
		System.out.println("Percentage of Student B: "+studentB.getPercentage()+"%");

	}

}
