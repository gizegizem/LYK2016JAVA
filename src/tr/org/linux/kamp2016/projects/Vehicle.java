package tr.org.linux.kamp2016.projects;

public abstract class Vehicle {
	String brand, model;
	int speed, capacity, numberOfWheels;
	boolean hasAerofoil, hasAutoPilot;

	public Vehicle(String brand, String model, int speed) {
		this.brand = brand;
		this.model = model;
		this.speed = speed;
	}

	public Vehicle(String brand, String model, int speed, int capacity,
			int numberOfWheels, boolean hasAerofoil, boolean hasAutoPilot) {
		this.brand = brand;
		this.model = model;
		this.speed = speed;
		this.capacity = capacity;
		this.numberOfWheels = numberOfWheels;
		this.hasAerofoil = hasAerofoil;
		this.hasAutoPilot = hasAutoPilot;
	}

	public enum GasType {
		GASOLİNE, LPG, DIESEL_FUEL, JET_FUEL
	}

}
