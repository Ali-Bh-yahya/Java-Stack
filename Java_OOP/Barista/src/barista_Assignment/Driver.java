package barista_Assignment;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		// Menu items
		Item item1 = new Item("mocha", 4.4);
		Item item2 = new Item("latte", 3.2);
		Item item3 = new Item("drip coffee", 2.0);
		Item item4 = new Item("cappuccino", 2.0);
		Order order1 = new Order("Cindhuri");
		Order order2 = new Order("Jimmy");
		Order order3 = new Order("Noah");
		Order order4 = new Order("Sam");
		
		order1.addItem(item1);
		order1.addItem(item2);
		order2.addItem(item1);
		order3.addItem(item3);
		order4.addItem(item4);

		order1.setReady(true);
		order4.setReady(true);
		// Order variables -- order1, order2 etc.
		order1.displayInfo();
		order2.displayInfo();
		order3.displayInfo();
		order4.displayInfo();
		// Application Simulations
		// Use this example code to test various orders' updates
		
//        order2.addItem(item2);
//        order3.addItem(item3);
//        order4.addItem(item1);
//        order2.setReady(true);
//        order1.addItem(item3);
//        order1.addItem(item2);
//        order1.setReady(true);
//        System.out.println("Name:\n:"+" "+ order1.getName()+" "+order1.total+" "+order1.ready);
//        System.out.println("Name:\n:"+" "+ order2.getName()+" "+order2.total+" "+ order2.ready); 
	}

}
