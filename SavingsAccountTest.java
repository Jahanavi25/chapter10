package PackCodeExercises;

public class SavingsAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount saver1 = new SavingsAccount(2000.0); //SavingsAccount first object 
		SavingsAccount saver2 = new SavingsAccount(3000.0); // SavingsAccount second object
		
		SavingsAccount.modifyInterestRate(4.0); //setting interest rate to 4
		
		System.out.println("\ninterest rate is 4.0");
		System.out.printf("Balance for Saver1 = "+saver1.getSavingsBalance()+"\nBalance for Saver2 = "+saver2.getSavingsBalance()+"\nBalance for saver 1 after interest = "+(saver1.getSavingsBalance()+saver1.monthlyInterest())+"\nBalance for saver 2 after interest="+(saver2.getSavingsBalance()+saver2.monthlyInterest()));

		System.out.println("\ninterest rate is 5.0");
		
        SavingsAccount.modifyInterestRate(5.0);//modifying interest rate 
		
		System.out.printf("Balance for Saver1 = "+saver1.getSavingsBalance()+"\nBalance for Saver2 = "+saver2.getSavingsBalance()+"\nBalance for saver 1 after interest = "+(saver1.getSavingsBalance()+saver1.monthlyInterest())+"\nBalance for saver 2 after interest="+(saver2.getSavingsBalance()+saver2.monthlyInterest()));

	}

}
