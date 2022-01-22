package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import factory.HondaAdventure;
import factory.HondaCruiser;
import factory.HondaSport;
import factory.HondaWarehouse;
import factory.Motorcycle;
import factory.YamahaAdventure;
import factory.YamahaCruiser;
import factory.YamahaSport;
import factory.YamahaWarehouse;

class TestHondaWarehouse {

	@Test
	void testCruiser() {
		HondaWarehouse warehouse = new HondaWarehouse();
		Motorcycle motorcycle = warehouse.fetchParts(1);
		assert(motorcycle instanceof HondaCruiser);
	}
	
	@Test
	void testSport() {
		HondaWarehouse warehouse = new HondaWarehouse();
		Motorcycle motorcycle = warehouse.fetchParts(2);
		assert(motorcycle instanceof HondaSport);
	}
	
	@Test
	void testAdventure() {
		HondaWarehouse warehouse = new HondaWarehouse();
		Motorcycle motorcycle = warehouse.fetchParts(3);
		assert(motorcycle instanceof HondaAdventure);
	}
}
