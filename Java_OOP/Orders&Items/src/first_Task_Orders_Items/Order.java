package first_Task_Orders_Items;
import java.util.ArrayList;


public class Order {
  String name;
  double total;
  boolean ready;
  ArrayList<Item> items;
	public Order(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.total = 0.0;
		this.ready = false;
		this.items = new ArrayList<>();
	}
	
	public void addItem(Item item) {
		this.items.add(item);
		this.total += item.price;	
	}
	
	public void setReady(boolean ready) {
		this.ready = ready;
	}

}
