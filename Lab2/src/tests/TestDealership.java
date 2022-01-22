package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import factory.Dealership;
import factory.HarleyDavidsonWarehouse;
import factory.HondaWarehouse;
import factory.MotorcycleWarehouse;
import factory.YamahaWarehouse;

class TestDealership {

	@Test
	void testPickBrandHonda() {
		Dealership dealership = new Dealership();
		MotorcycleWarehouse warehouse = dealership.pickBrand(1);
		assert(warehouse instanceof HondaWarehouse);
	}
	
	@Test
	void testPickBrandYamaha() {
		Dealership dealership = new Dealership();
		MotorcycleWarehouse warehouse = dealership.pickBrand(2);
		assert(warehouse instanceof YamahaWarehouse);
	}
	
	@Test
	void testPickBrandHarley() {
		Dealership dealership = new Dealership();
		MotorcycleWarehouse warehouse = dealership.pickBrand(3);
		assert(warehouse instanceof HarleyDavidsonWarehouse);
	}

}
