package coffeeApppackage;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class coffeeKiosk {
	Scanner user = new Scanner(System.in);

	ArrayList<Item> menu;
	ArrayList<Order> orders;

	public coffeeKiosk() {

		menu = new ArrayList();
		orders = new ArrayList();

	}

	public void addMenuItem(String name, double price) {
		Item item = new Item(name, price);
		item.setIndex(menu.size());
		menu.add(item);
	}

	public void displayMenu() {
		System.out.println("======Menu======");
		for (Item item : menu) {
			System.out.println(item.getIndex() + " " + item.getName() + " --- $" + item.getPrice());
		}
		System.out.println("================");
	}

	public void newOrder() {
		System.out.println("Please enter customer name for bew order:\n");
		String userName = user.nextLine();
		Order order = new Order(userName);
		displayMenu();
		System.out.println("Please enter a menu item index or q to quit :");
		String input = user.nextLine();
		while (!input.equalsIgnoreCase("q")) {
			try {
				int index = Integer.parseInt(input);
				if (index >= 0 && index < menu.size()) {
					// Add item to order
					Item selectedItem = menu.get(index);
					order.addItem(selectedItem);
					System.out.println(selectedItem.getName() + " added to your order.");
				} else {
					System.out.println("Invalid index. Please try again.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a number or 'q' to quit.");
			}

			// Prompt for next input
			System.out.println("Please enter a menu item index or 'q' to quit:");
			input = user.nextLine();
		}

		orders.add(order);
		System.out.println("\nOrder Summary:");
		order.displayInfo();

	}
}
