package oopsassignments;

//Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and 
//$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'are 
//subclasses of class 'Bank', each having a method named 'getBalance'. Call this 
//method by creating an object of each of the three classes. 

abstract class Bank{
	abstract int getBalance();
}

class BankA extends Bank{
	int balance=100;
	int getBalance() {
		return balance;
	}
}

class BankB extends Bank{
	int balance=150;
	int getBalance() {
		return balance;
	}
}

class BankC extends Bank{
	int balance=200;
	int getBalance() {
		return balance;
	}
}

public class AbstractBank {

	public static void main(String[] args) {
		BankA bankA=new BankA();
		BankB bankB=new BankB();
		BankC bankC=new BankC();
		
		System.out.println("Bank A Balance : "+bankA.getBalance());
		System.out.println("Bank B Balance : "+bankB.getBalance());
		System.out.println("Bank C Balance : "+bankC.getBalance());

	}

}
