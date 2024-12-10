package bank_Account;

public class BankAccount {
	private double cheackingBalance;
	private double savingBalance;
	private static int accounts;
	private static double totalMoney;

	public BankAccount() {
		this.cheackingBalance = 0;
		this.savingBalance = 0;
		accounts++;

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

	public double getCheackingBalance() {
		return cheackingBalance;
	}

	public void deposit(String accountType, double money) {
		System.out.println("Insert the amount put in");
		double task = money;
		totalMoney += task;
		if (accountType == "cheacking") {

			cheackingBalance += task;
			System.out.println("Your account balance is : \t" + cheackingBalance);
		} else {
			savingBalance += task;
			System.out.println("Your account balance is : \t" + savingBalance);
		}
	}

	public void withDrawMoney(String typeAccount, double money) {
		double task = money;
		if (typeAccount == "cheacking") {
			if (getCheackingBalance() >= task) {
				cheackingBalance -= task;
				System.out.println("Your account balance is : \t" + cheackingBalance);
			} else {
				System.out.println("Insufficient funds.");
			}
		} else {
			if (getSavingBalance() >= task) {
				savingBalance -= task;
				System.out.println("Your account balance is : \t" + savingBalance);
			} else {
				System.out.println("Insufficient funds.");
			}

		}

	}

	public void getBalance() {
		System.out.println(
				"Total balance:\t" + "Checking: $" + getCheackingBalance() + "\tSavings: $" + getSavingBalance());
	}

	public void display() {
		System.out.println("Checking Balance: $" + cheackingBalance);
		System.out.println("Saving Balance: $" + savingBalance);
		System.out.println("Total Balance: $" + (cheackingBalance + savingBalance));
	}

}
