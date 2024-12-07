package Java_Cafe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Cafe_Util {
	/*
	 * ***************** Developer Ali Yahya: this method for sums every consecutive
	 * integer from 1 to 10 and returns the total.
	 */

	public int getStreakGoal() {
		int sum = 0;
		for (int num = 0; num <= 10; num++) {
			sum += num;
		}
		return sum;
	}

	/*
	 * ***************** | Developer Ali Yahya: this method for sums every
	 * consecutive integer from 1 to number of any value like(15,20,25) and returns
	 * the total. |
	 */
	public int getStreakGoal(int numOfWeeks) {
		int sum = 0;
		for (int num = 0; num <= numOfWeeks; num++) {
			sum += num;
		}
		return sum;
	}

	public double getOrderTotal(double[] prices) {
		double sum = 0.0;
		for (int numOforder = 0; numOforder < prices.length; numOforder++) {
			sum += prices[numOforder];
		}
		return sum;
	}

	public void displayMenu(ArrayList<String> menuItems) {
		for (int i = 0; i < menuItems.size(); i++) {
			System.out.println(i + " " + menuItems.get(i));
		}

	}

	public void addCustomer(ArrayList<String> customers) {
	Scanner user = new Scanner(System.in);
	System.out.println("Enter tour name please ....");
	String username = user.nextLine();
	
	System.out.printf("There are %d"+" "+ username+" "+"people in front of you !!/n",customers.size());//%d its a format of decimal integer
	customers.add(username);
	System.out.println(customers);
	}

}
