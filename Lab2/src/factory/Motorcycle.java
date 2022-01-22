package factory;

public abstract class Motorcycle {
	String description = "Unknown motorcycle model";
	double cost;
	
	public double cost() {
		return cost;
	}
	
	public String getDescription() {
		return description;
	}
}
