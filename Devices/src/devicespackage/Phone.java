package devicespackage;

public class Phone extends Device {

	public Phone() {
		super();
	}
	
	public void call() {
		int battryLevel = this.battryLevel;
		 this.battryLevel-=5;
		 System.out.println("Making call decrease your battery "+" "+battryLevel);
	}
	
	public void playAGame() {
		int battryLevel = this.battryLevel;
		 this.battryLevel-=20;
		 System.out.println("Playing a game decrease your battery"+" "+battryLevel);
	}
	
	public void charging() {
		int battryLevel = this.battryLevel;
		 this.battryLevel-=50;
		 System.out.println("Charging increase your battery"+" "+battryLevel);
	}
	
	

}
