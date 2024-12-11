package coffeeApppackage;

public class Driver {

	public static void main(String[] args) {


		coffeeKiosk coffeLab = new coffeeKiosk();
		
		coffeLab.addMenuItem("mocha", 4.4);
		coffeLab.addMenuItem("latte", 3.2);
		coffeLab.addMenuItem("drip coffee", 2.0);
		coffeLab.addMenuItem("cappuccino", 2.0);
		
		coffeLab.newOrder();
				
	}

}
