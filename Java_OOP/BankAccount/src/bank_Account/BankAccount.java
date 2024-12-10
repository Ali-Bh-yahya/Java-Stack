package bank_Account;
import java.util.Scanner;
public class BankAccount {
	private double cheackingBalance;

	private double savingBalance;
	private static int accounts;
	private static double totalMoney;
	public static int numberOfAccount;

	public BankAccount() {
		numberOfAccount++;
		accounts++;
	}

	public BankAccount(double cheackingBalance, double savingBalance) {
		this.cheackingBalance=0;
		this.savingBalance = 0;
		BankAccount.totalMoney = savingBalance + getCheackingBalance() ;
	}

	public double getSavingBalance() {
		return savingBalance;
	}

	public static int getAccounts() {
		return accounts;
	}

	public static void setAccounts(int accounts) {
		BankAccount.accounts = accounts;
	}

	public static double getTotalMoney() {
		return totalMoney;
	}

	public static int getNumberOfAccount() {
		return numberOfAccount;
	}

	public double getCheackingBalance() {
		return cheackingBalance;
	}
	
	public void deposit(Scanner ask) {
		System.out.println("Insert the amount put in");
		double task = ask.nextDouble();
		savingBalance += task;
		System.out.println("Your account balance is : \t"+savingBalance);
	}
	
	public void withDrawMoney(String typeAccount,Scanner ask) {
		if(typeAccount == "saving account") {
		double task = ask.nextDouble();
		savingBalance += task;
		System.out.println("Your account balance is : \t"+savingBalance);}
		else {
			System.out.println("Sorry you cant withDraw becouse there are insufficinient funds");}
		}
	
	  public void display() {
	        System.out.println("Checking Balance: $" + cheackingBalance);
	        System.out.println("Saving Balance: $" + savingBalance);
	        System.out.println("Total Balance: $" + (cheackingBalance + savingBalance));
	    }
	
	
		
	}
	
	
	

}
