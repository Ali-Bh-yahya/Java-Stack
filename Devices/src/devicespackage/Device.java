package devicespackage;

public class Device {
    
	protected int battryLevel;
    
	public Device() {
	this.battryLevel = 100;
	}
	
	public int displayDeviceBattery(){
		System.out.println("the battery is"+" %"+this.battryLevel+" " );
		return this.battryLevel;
	}
	

}
