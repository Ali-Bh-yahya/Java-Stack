package useCase.com;

public abstract class Library {
	private String name;
	private double price;
	private boolean brorwing;
	private boolean returning ;
	private boolean cheackingAvailability;

	public Library() {
		
	}

	public boolean isBrorwing() {
		return brorwing;
	}

	public void setBrorwing(boolean brorwing) {
		this.brorwing = brorwing;
	}

	public boolean isReturning() {
		return returning;
	}

	public void setReturning(boolean returning) {
		this.returning = returning;
	}

	public boolean isCheackingAvailability() {
		return cheackingAvailability;
	}

	public void setCheackingAvailability(boolean cheackingAvailability) {
		this.cheackingAvailability = cheackingAvailability;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	//methods:
	
	public abstract void BorrwingItems();
	
	public abstract void returnItems();
	
	public abstract void cheackAvailability();
	
	public abstract void lateFeeCalculation();
	
	public abstract void overdueNotification();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
