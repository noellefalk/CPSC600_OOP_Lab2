package factory;

import singleton.Mechanic;

//The warehouse has the parts and has one mechanic responsible for building the motorcycles that are ordered.
public abstract class MotorcycleWarehouse {
	
	abstract Motorcycle fetchParts(int model);
	
	public Motorcycle buildMotorcycle(int modelType) {
		Motorcycle motorcycle;
		Mechanic mechanic = Mechanic.getInstance();
		
		motorcycle = fetchParts(modelType);
		Thread thread = new Thread(() -> mechanic.assembleMotorcycle());
		thread.start();
		return motorcycle;
	}
}
