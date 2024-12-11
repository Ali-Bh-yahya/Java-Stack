package bank_Account;

public class BankTest {
  public static void main(String[] args) {
	  BankAccount AliAccount = new BankAccount(0,0);
		
		AliAccount.deposit("cheacking",1000);
		AliAccount.deposit("saving",500);
		AliAccount.getBalance();
		
		AliAccount.withDrawMoney("cheacking", 780);
		AliAccount.withDrawMoney("cheacking", 220);
//		AliAccount.getBalance();
		
		AliAccount.display();
  }
}
