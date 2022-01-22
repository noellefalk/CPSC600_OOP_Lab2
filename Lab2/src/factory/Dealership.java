package factory;

public class Dealership {
	
	public MotorcycleWarehouse pickBrand(int make) {
		switch (make) {
		case 1: 
			return new HondaWarehouse();
		case 2:
			return new YamahaWarehouse();
		case 3:
			return new HarleyDavidsonWarehouse();
		default:
			throw new IllegalArgumentException("The value entered is invaild. Please try again.");
		}
	}
}
