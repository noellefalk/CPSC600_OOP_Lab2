package factory;

public class YamahaWarehouse extends MotorcycleWarehouse {
	
	public Motorcycle fetchParts(int model) {
		switch (model) {
		case 1:
			return new YamahaCruiser();
		case 2:
			return new YamahaSport();
		case 3:
			return new YamahaAdventure();
		default:
			throw new IllegalArgumentException("The value entered is invaild. Please try again.");
		}
	}
}
