package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import factory.Motorcycle;
import factory.YamahaAdventure;
import factory.YamahaCruiser;
import factory.YamahaSport;
import factory.YamahaWarehouse;

class TestYamahaWarehouse {

	@Test
	void testCruiser() {
		YamahaWarehouse warehouse = new YamahaWarehouse();
		Motorcycle motorcycle = warehouse.fetchParts(1);
		assert(motorcycle instanceof YamahaCruiser);
	}
	
	@Test
	void testSport() {
		YamahaWarehouse warehouse = new YamahaWarehouse();
		Motorcycle motorcycle = warehouse.fetchParts(2);
		assert(motorcycle instanceof YamahaSport);
	}
	
	@Test
	void testAdventure() {
		YamahaWarehouse warehouse = new YamahaWarehouse();
		Motorcycle motorcycle = warehouse.fetchParts(3);
		assert(motorcycle instanceof YamahaAdventure);
	}
}
