package first_Task_Orders_Items;
import java.util.ArrayList;


public class Driver {

	public static void main(String[] args) {
		
        // Menu items
		Item item1 = new Item("mocha" , 4.4 );
		Item item2 = new Item("latte" , 3.2);
		Item item3 = new Item("drip coffee" , 2.0);
		Item item4 = new Item("cappuccino" , 2.0);
		Order order1 = new Order("Cindhuri");
		Order order2 = new Order("Jimmy");
		Order order3 = new Order("Noah");
		Order order4 = new Order("Sam");
		

		
    
        // Order variables -- order1, order2 etc.
    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        
        order2.addItem(item2);
        order3.addItem(item3);
        order4.addItem(item1);
        order2.setReady(true);
        order1.addItem(item3);
        order1.addItem(item2);
        order1.setReady(true);
        System.out.println("Name:\n:"+" "+ order1.name+" "+order1.total+" "+order1.ready);
        System.out.println("Name:\n:"+" "+ order2.name+" "+order2.total+" "+ order2.ready); 
	}

}
