package factory;

public class HondaWarehouse extends MotorcycleWarehouse {
	
	public Motorcycle fetchParts(int model) {
		switch (model) {
		case 1: 
			return new HondaCruiser();
		case 2:
			return new HondaSport();
		case 3:
			return new HondaAdventure();
		default: 
			throw new IllegalArgumentException("The value entered is invaild. Please try again.");
		}
	}
}
