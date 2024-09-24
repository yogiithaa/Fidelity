package Prog4;
public class ParkingLotSystem {

    public static void main(String[] args) {
        // Create an instance of Car
        Car myCar = new Car("ABC123", "Toyota", 4);
        System.out.println("--- Car Details ---");
        myCar.displayInfo();
        System.out.println("Parking Fee: Rs. " + myCar.calculateParkingFee());

        // Create an instance of Motorcycle
        Motorcycle myMotorcycle = new Motorcycle("XYZ789", "Honda", "Petrol");
        System.out.println("\n--- Motorcycle Details ---");
        myMotorcycle.displayInfo();
        System.out.println("Parking Fee: Rs. " + myMotorcycle.calculateParkingFee());
    }
}