/*In this project, you will write a program that will calculate the monthly car payment a user should expect to make after taking out a car loan.
*/

public class CarLoan {
	public static void main(String[] args) {
int carloan = 10000;
int loanLength = 3;
int interestRate = 5;
int downPayment = 2000;
if (loanLength <= 0) {
    System.out.println("Error! You must take out a valid car loan.");
  }  else if (downPayment>=carloan){
    System.out.println("The car can be paid in full.");
  } else {
    int remainingBalance = carloan - downPayment;
    int months = loanLength*12;
    int monthlyBalance = remainingBalance/months;
    int interest = (monthlyBalance*interestRate)/100;
    int monthlyPayment = monthlyBalance + interest;
    System.out.println(monthlyPayment);
  }
	}
}