package barista_Assignment;

import java.util.ArrayList;

public class Order {
	private String name;
	private boolean ready;
	private ArrayList<Item> items;

	public Order(String name) {
		this.setName(name);
		this.setReady(false);
		this.items = new ArrayList<>();
	}

	public boolean getReady() {
		return ready;
	}

	public void setReady(boolean ready) {
		this.ready = ready;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public void addItem(Item item) {
		items.add(item);
	}
	public String getStatusMassage() {
		if(this.getReady()) {
			return "Your order is ready . ";
		}else {
			return"Thank you for waiting. Your order will be ready soon.";
		}
	}
	
	public double getOrderTotal() {
		double totle = 0.0;
	    for (Item item : items) {
	    	totle += item.getPrice();
	    }
	    return totle;
	}
	
	public void displayInfo() {
		System.out.println("Customer Name : \t"+ this.getName());
		for(Item item : items) {
		System.out.println(item.getName()+" - $"+item.getPrice());
		}
		System.out.println(this.getOrderTotal());
	}
	
	

}
