package Assessment;

public abstract class Vehicle {
	
int modelYear = 0;
boolean isRunning = false;
public Vehicle(int modelYear, boolean isRunning, String color, Object black) {
	super();
	this.modelYear = modelYear;
	this.isRunning = isRunning;
	this.color = color;
	
	Vehicle(2005, false, black);
}



public int getModelYear() {
	return modelYear;
}



public void setModelYear(int modelYear) {
	this.modelYear = modelYear;
}



public boolean isRunning() {
	return isRunning;
}



public void setRunning(boolean isRunning) {
	this.isRunning = isRunning;
}



public String getColor() {
	return color;
}



public void setColor(String color) {
	this.color = color;
}



public Vehicle(int modelYear2, boolean isRunning2, String color2) {
	// TODO Auto-generated constructor stub
	
}



String color = null;



	public static void main(String[] args) {
		
		
		
	}

}
