/* Creating a class SavingsAccount with 
 *      static variable to store the annual interest rate
 *       
 *       private instance variable to store the savings balance
 *       
 *       Method to calculate monthly interest rate
 *
 * Creating a test class with two savings object where first object interest rate is 4% and the second one 5%*/

package PackCodeExercises;

public class SavingsAccount {

	 static double annualInterest; 
	 private double savingsBalance; 
	 
	 public SavingsAccount(double savingsBalance){
		 this.savingsBalance = savingsBalance;
	 }
	 
	 //method to calculate monthly interest
	 
	 public double monthlyInterest(){
		 return (savingsBalance*annualInterest)/12;
	 }
	 //method to modify the interest rate
	 
	 public static void modifyInterestRate(double rate){
		 annualInterest = rate;
		 
	 }
	 
	 public static double getAnnualInterest(){
		 return annualInterest;
	 }
	 
	 public  double getSavingsBalance(){
		 return savingsBalance; 
	 }
		



}
