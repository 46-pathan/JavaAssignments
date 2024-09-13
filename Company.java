package oopsassignments;

//Create a class named 'Member' having the following members: 
//1. Data members 
//2. Name 
//3. Age 
//4. Phone number 
//5. Address 
//6. Salary 
//It also has a method named 'printSalary' which prints the salary of the members. 

class Member{
	int dataMembers;
	String name;
	int age;
	String phoneNumber;
	String address;
	int salary;
	
	Member(int data,String name,int age,String pno,String address,int salary){
		this.dataMembers=data;
		this.name=name;
		this.age=age;
		this.phoneNumber=pno;
		this.address=address;
		this.salary=salary;
	}
	
	void printSalary() {
		System.out.println(name+"'s salary is : "+salary);
	}
}

public class Company {

	public static void main(String[] args) {
		Member m1=new Member(1,"Rina",20,"1234567890","Anand",15000);
		m1.printSalary();
	}

}
