package Prog4;
// Base class: Vehicle
class Vehicle {
    // Common attributes for all vehicles
    String registrationNumber;
    String brand;

    // Constructor for Vehicle class
    public Vehicle(String registrationNumber, String brand) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }

    // Method to calculate parking fee (to be overridden by derived classes)
    public double calculateParkingFee() {
        return 0.0; // Default fee, overridden in derived classes
    }

    // Method to display common vehicle details
    public void displayInfo() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Brand: " + brand);
    }
}

// Derived class: Car
class Car extends Vehicle {
    // Additional attribute specific to Car
    int numDoors;

    // Constructor for Car class
    public Car(String registrationNumber, String brand, int numDoors) {
        super(registrationNumber, brand); // Call the Vehicle constructor
        this.numDoors = numDoors;
    }

    // Override calculateParkingFee method for Car
    @Override
    public double calculateParkingFee() {
        return 50.0; // Flat fee for cars
    }

    // Method to display Car-specific details
    public void displayInfo() {
        super.displayInfo(); // Call the display method from Vehicle
        System.out.println("Number of Doors: " + numDoors);
    }
}

// Derived class: Motorcycle
class Motorcycle extends Vehicle {
    // Additional attribute specific to Motorcycle
    String engineType;

    // Constructor for Motorcycle class
    public Motorcycle(String registrationNumber, String brand, String engineType) {
        super(registrationNumber, brand); // Call the Vehicle constructor
        this.engineType = engineType;
    }

    // Override calculateParkingFee method for Motorcycle
    @Override
    public double calculateParkingFee() {
        return 20.0; // Flat fee for motorcycles
    }

    // Method to display Motorcycle-specific details
    public void displayInfo() {
        super.displayInfo(); // Call the display method from Vehicle
        System.out.println("Engine Type: " + engineType);
    }
}



