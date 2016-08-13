package tr.org.linux.kamp2016.projects;

public class Car extends Vehicle implements Driveable {
	String id;

	public Car(String brand, String model, int speed, String id) {
		super(brand, model, speed);
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", model=" + model
				+ ", speed=" + speed + "]";
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
