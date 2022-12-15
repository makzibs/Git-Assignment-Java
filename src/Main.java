
class Car {

	private String model;
	private String brand;
	private int amountOfFuel;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getAmountOfFuel() {
		return amountOfFuel;
	}

	public void setAmountOfFuel(int amountOfFuel) {
		this.amountOfFuel = amountOfFuel;
	}

	public Car(String model, String brand, int amountOfFuel) {
		super();
		this.model = model;
		this.brand = brand;
		this.amountOfFuel = amountOfFuel;
	}

	public void carBreak() {
		System.out.println("Car is breaking.");
	}

	public void accelerate() {
		if (this.amountOfFuel <= 0)
			return;
		this.amountOfFuel--;
		System.out.println("Car is accelerating.");
	}

	public void refuel(int refuelAmount) {
		System.out.println("Fuel on the tank:" + this.amountOfFuel);
		System.out.println("Refuel: " + refuelAmount);
		this.amountOfFuel += refuelAmount;
		System.out.println("Fuel on the tank after the refuel:" + this.amountOfFuel);
	}

	public void printData() {
		System.out.printf("Model: %s \nbrand: %s \namount of fuel : %d\n", model, brand, amountOfFuel);
	}

}

public class Main {

	public static void main(String[] args) {

		Car car = new Car("Kia", "punto", 3);

		car.printData();
		System.out.println("-------------------------");
		car.accelerate();
		System.out.println("-------------------------");
		car.carBreak();
		System.out.println("-------------------------");
		car.printData();
		System.out.println("-------------------------");
		car.refuel(5);
		System.out.println("-------------------------");
		car.printData();

	}

}