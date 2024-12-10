package zookeeperpackage;

public class Gorilla extends Mammal {
	
	
	public Gorilla() {
		super();
			}

	public void throwSomthing() {
	 int energyLevel = this.getEnergyLevel();
	 this.setEnergyLevel(energyLevel-5);
	 System.out.println("this gorilla has thrown somthing"+" "+energyLevel);
	}
	
	public void eatBananas() {
	 int energyLevel = this.getEnergyLevel();
	 this.setEnergyLevel(energyLevel+10);
	 System.out.println("this gorilla has eatBananas"+" "+energyLevel);

	}
	
	public void climb() {
		 int energyLevel = this.getEnergyLevel();
		 this.setEnergyLevel(energyLevel+10);
		 System.out.println("this gorilla has climb"+" "+energyLevel);

	}
	
	
	
	


}
