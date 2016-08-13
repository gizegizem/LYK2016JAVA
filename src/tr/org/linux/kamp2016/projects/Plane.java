package tr.org.linux.kamp2016.projects;

public class Plane extends Vehicle implements Driveable {
	int maximumFeet;
	String flightCode;
	boolean isAutoPilotActive;

	public Plane(String brand, String model, int speed, int capacity,
			int numberOfWheels, boolean hasAerofoil, boolean hasAutoPilot,
			int maximumFeet, String flightCode, boolean isAutoPilotActive) {
		super(brand, model, speed, capacity, numberOfWheels, hasAerofoil,
				hasAutoPilot);
		this.maximumFeet = maximumFeet;
		this.flightCode = flightCode;
		this.isAutoPilotActive = isAutoPilotActive;
	}

	@Override
	public String toString() {
		return "Plane [maximumFeet=" + maximumFeet + ", flightCode="
				+ flightCode + "\nisAutoPilotActive=" + isAutoPilotActive
				+ "brand=" + brand + ", model=" + model + ", speed=" + speed
				+ "\ncapacity=" + capacity + ", numberOfWheels="
				+ numberOfWheels + ", hasAerofoil=" + hasAerofoil
				+ ", hasAutoPilot=" + hasAutoPilot + "]";
	}

	public enum liftOffType {
		LIFTOFF_HORİZONTAL, LIFTOFF_VERTICAL
	}

	@Override
	public void executeMotor() {
		System.out.println("motor çalıştırılyor.");

	}

	@Override
	public void processGas() {
		System.out.println("gas yürütülüyor..");

	}

	@Override
	public void enableSteeringWheels() {
		System.out.println("sttering ve wheels etkinleştiriliyor.");
	}
}
