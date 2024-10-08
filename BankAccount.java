package exceptionassignments;

//W.A.J.P to create a custom exception if Customer withdraw amount which is greater 
//than account balance then program will show custom exception otherwise amount 
//will deduct from account balance. Account balance is: 2000 Enter withdraw amount: 
//2500 
//Sorry, insufficient balance, you need more 500 Rs. To perform this transaction. 

class InsufficientBalanceException extends Exception{
	InsufficientBalanceException(String message){
		super(message);
	}
}

public class BankAccount {

	int balance=2000;
	
	void withdraw(int amount) throws InsufficientBalanceException{
		if(amount>balance) {
			throw new InsufficientBalanceException("Sorry, insufficient balance, you need more "+(amount-balance)+" Rs. To perform this transaction. ");
		}else {
			balance-=amount;
			System.out.println("Balance : "+balance);
		}
	}
	
	public static void main(String[] args) {
		BankAccount ba=new BankAccount();
		int amount=2500;
		try {
			ba.withdraw(amount);
		}catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}

}
