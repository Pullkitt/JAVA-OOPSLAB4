package exp5;

public class Vehicle {
	    String brand;
	    String model;
	    double price;

	    Vehicle(String brand, String model, double price) {
	        this.brand = brand;
	        this.model = model;
	        this.price = price;
	    }

	    void displayDetails() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Model: " + model);
	        System.out.println("Price:" + price);
	    }
	}

	// Car class extending Vehicle
	class Car extends Vehicle {
	    int seatingCapacity;
	    String fuelType;

	    Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
	        super(brand, model, price);
	        this.seatingCapacity = seatingCapacity;
	        this.fuelType = fuelType;
	    }

	    @Override
	    void displayDetails() {
	        super.displayDetails();
	        System.out.println("Seating Capacity: " + seatingCapacity);
	        System.out.println("Fuel Type: " + fuelType);
	    }
	}

	// ElectricCar class extending Car
	class ElectricCar extends Car {
	    int batteryCapacity;
	    double chargingTime;

	    ElectricCar(String brand, String model, double price, int seatingCapacity, String fuelType, int batteryCapacity, double chargingTime) {
	        super(brand, model, price, seatingCapacity, fuelType);
	        this.batteryCapacity = batteryCapacity;
	        this.chargingTime = chargingTime;
	    }

	    @Override
	    void displayDetails() {
	        super.displayDetails();
	        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
	        System.out.println("Charging Time: " + chargingTime + " hours");
	    }
	}

	// Motorcycle class extending Vehicle
	class Motorcycle extends Vehicle {
	    int engineCapacity;
	    String type;

	    Motorcycle(String brand, String model, double price, int engineCapacity, String type) {
	        super(brand, model, price);
	        this.engineCapacity = engineCapacity;
	        this.type = type;
	    }

	    @Override
	    void displayDetails() {
	        super.displayDetails();
	        System.out.println("Engine Capacity: " + engineCapacity + " cc");
	        System.out.println("Type: " + type);
	    }
	}

	// Main class to test the hierarchy
	public class VehicleTest {
	    public static void main(String[] args) {
	        Vehicle vehicle = new Vehicle("Generic", "ModelX", 20000);
	        Car car = new Car("Suzuki", "VItara", 25000, 5, "Petrol");
	        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 75000, 5, "Electric", 100, 1.5);
	        Motorcycle motorcycle = new Motorcycle("HarleyDavidson", "Street 750", 8000, 749, "Cruiser");

	        System.out.println("Vehicle Details:");
	        vehicle.displayDetails();

	        System.out.println("\nCar Details:");
	        car.displayDetails();

	        System.out.println("\nElectric Car Details:");
	        electricCar.displayDetails();

	        System.out.println("\nMotorcycle Details:");
	        motorcycle.displayDetails();
	    }
	}


