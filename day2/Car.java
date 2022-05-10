package day2;

public class Car {
	public void applyBreak() {
		System.out.println("Press Break");
	}
	public void applyGear() {
		System.out.println("Gear 1 to move");
	}
	public void switchOnAc() {
		System.out.println("Press AC Button");
	}
	public void applyAccelate() {
		System.out.println("Apply Accelater Slowly release Clutch");
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.applyBreak();
		c.applyGear();
		c.switchOnAc();
		c.applyAccelate();
	}
	

}
