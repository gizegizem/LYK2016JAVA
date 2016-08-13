package tr.org.linux.kamp2016.projects;

public class VehicleTest {
	public static void main(String args[]){
	Plane plane1=new Plane("Pegasus", "A300", 800, 150, 8, true, false, 9000, "Ist10", false);
	Plane plane2=new Plane("THY", "S300", 500, 50, 10, false, false, 7500, "Ank5", true);
	
	Car car1=new Car("Mercedes","B200",260,"220115");
	Car car2=new Car("Peugeot","301",220,"150396");

	System.out.println("1.uçak");
	plane1.executeMotor();
	System.out.println(plane1.brand);
	System.out.println("uçağın kalkış biçimi: "+Plane.liftOffType.LIFTOFF_HORİZONTAL);
	System.out.println(plane1.toString());
	System.out.println("**************************************");
	System.out.println("2.uçak");
	System.out.println(plane2.brand);
	plane2.enableSteeringWheels();
	System.out.println("uçağın kalkış biçimi: "+Plane.liftOffType.LIFTOFF_VERTICAL);
	System.out.println(plane2.toString());
	System.out.println("**************************************");
	System.out.println("1.araba");
	car1.executeMotor();
	System.out.println(car1.id);
	System.out.println("arabanın Gas tipi: "+ Vehicle.GasType.DIESEL_FUEL);
	System.out.println(car1.toString());
	System.out.println("**************************************");
	System.out.println("2.araba");
	System.out.println(car2.model);
	car2.processGas();
	System.out.println("arabanın Gas tipi: "+ Vehicle.GasType.JET_FUEL);
	System.out.println(car2.toString());
	
	
}
}
