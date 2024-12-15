package useCase.com;

public  class DVD extends Library implements DVDHeater {
	public int pages;
	public DVD(int pages) {
		super();
		this.pages=pages;
	}

	@Override
	public void BorrwingItems() {
		
	}

	@Override
	public void returnItems() {
		
	}

	@Override
	public void cheackAvailability() {
		
		
	}

	@Override
	public void lateFeeCalculation() {
		//if i will use the time if the user late 
		double price = this.getPrice();
		System.out.println("you should return the "+ price);

	}

	@Override
	public void overdueNotification() {
		if(this.isReturning()!= true) {
			System.out.println("you should return the "+ this.getName());
		}
	}

	@Override
	public void numOfPages(int pages) {
		System.out.println("the number of pages in this book "+ this.getName() +" "+pages);
	}


}
