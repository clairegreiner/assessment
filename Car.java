package Assessment;

public class Car extends Vehicle {
	
	boolean isStolen = false;
	boolean washedRecently = false;
	boolean AWD = false;
	int horsePower = 200;
	boolean stickShift = true;

	//without looking at the paper-rock-scissors or other templates, this is what I remember off the top of my head. /n
	//I've tried some no-IDE exercises already and know about this gap
	public void Car() {
		return;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Car(int modelYear, boolean isRunning, String color) {
		super(modelYear, isRunning, color);
		// TODO Auto-generated constructor stub
	}

}
