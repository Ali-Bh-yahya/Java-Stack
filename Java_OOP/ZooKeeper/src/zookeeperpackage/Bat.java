package zookeeperpackage;

public class Bat extends Mammal{

	public Bat() {
		int energyLevel=300;
		this.setEnergyLevel(energyLevel);
	}
	
	public void fly() {
		 int energyLevel = this.getEnergyLevel();
		 this.setEnergyLevel(energyLevel-50);
		 System.out.println("the bat is now airbone"+" "+energyLevel);
	}
	public void eatHmans() {
		 int energyLevel = this.getEnergyLevel();
		 this.setEnergyLevel(energyLevel+25);
		 System.out.println("the bat is now airbone"+" "+energyLevel);
	}
	
	public void atackTown() {
		 int energyLevel = this.getEnergyLevel();
		 this.setEnergyLevel(energyLevel-100);
		 System.out.println("the bat is now atack Town"+" "+energyLevel);
	}
	
	

}
