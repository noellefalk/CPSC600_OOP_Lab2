package factory;

public class HarleyDavidsonWarehouse extends MotorcycleWarehouse {
	
	public Motorcycle fetchParts(int model) {
		switch (model) {
		case 1:
			return new HarleyDavidsonCruiser();
		case 2:
			return new HarleyDavidsonSport();
		case 3:
			return new HarleyDavidsonAdventure();
		default:
			throw new IllegalArgumentException("The value entered is invaild. Please try again.");
		}
	}
}
