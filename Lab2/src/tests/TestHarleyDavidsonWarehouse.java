package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import factory.HarleyDavidsonAdventure;
import factory.HarleyDavidsonCruiser;
import factory.HarleyDavidsonSport;
import factory.HarleyDavidsonWarehouse;
import factory.Motorcycle;
import factory.YamahaAdventure;
import factory.YamahaCruiser;
import factory.YamahaSport;
import factory.YamahaWarehouse;

class TestHarleyDavidsonWarehouse {

	@Test
	void testCruiser() {
		HarleyDavidsonWarehouse warehouse = new HarleyDavidsonWarehouse();
		Motorcycle motorcycle = warehouse.fetchParts(1);
		assert(motorcycle instanceof HarleyDavidsonCruiser);
	}
	
	@Test
	void testSport() {
		HarleyDavidsonWarehouse warehouse = new HarleyDavidsonWarehouse();
		Motorcycle motorcycle = warehouse.fetchParts(2);
		assert(motorcycle instanceof HarleyDavidsonSport);
	}
	
	@Test
	void testAdventure() {
		HarleyDavidsonWarehouse warehouse = new HarleyDavidsonWarehouse();
		Motorcycle motorcycle = warehouse.fetchParts(3);
		assert(motorcycle instanceof HarleyDavidsonAdventure);
	}
}
