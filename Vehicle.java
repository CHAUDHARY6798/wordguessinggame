

// Base class Vehicle
class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected String fuelType;
    
    // Constructor
    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }
    
    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    // Method to calculate fuel efficiency
    public double calculateFuelEfficiency(double distance, double fuelConsumed) {
        return distance / fuelConsumed;
    }

    // Method to calculate distance traveled
    public double calculateDistance(double fuelConsumed, double fuelEfficiency) {
        return fuelConsumed * fuelEfficiency;
    }
}

// Subclass Truck
class Truck extends Vehicle {
    private double maxLoad;

    // Constructor
    public Truck(String make, String model, int year, String fuelType, double maxLoad) {
        super(make, model, year, fuelType);
        this.maxLoad = maxLoad;
    }

    // Getter for maxLoad
    public double getMaxLoad() {
        return maxLoad;
    }
    
    // Method to calculate maximum speed (dummy implementation)
    public double calculateMaxSpeed() {
        // Dummy implementation, actual calculation can be based on various factors
        return 120; // Assuming a maximum speed of 120 km/h for trucks
    }
}

// Subclass Car
class Car extends Vehicle {
    private int seatingCapacity;

    // Constructor
    public Car(String make, String model, int year, String fuelType, int seatingCapacity) {

        super(make, model, year, fuelType);
        this.seatingCapacity = seatingCapacity;
    }

    // Getter for seatingCapacity
    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    // Method to calculate maximum speed (dummy implementation)
    public double calculateMaxSpeed() {
        // Dummy implementation, actual calculation can be based on various factors
        return 180; // Assuming a maximum speed of 180 km/h for cars
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasFairing;

    // Constructor
    public Motorcycle(String make, String model, int year, String fuelType, boolean hasFairing) {
        super(make, model, year, fuelType);
        this.hasFairing = hasFairing;
    }

    // Getter for hasFairing
    public boolean hasFairing() {
        return hasFairing;
    }

    // Method to calculate maximum speed (dummy implementation)
    public double calculateMaxSpeed() {
        // Dummy implementation, actual calculation can be based on various factors
        return 220; // Assuming a maximum speed of 220 km/h for motorcycles
    }
}
class Main {
    public static void main(String[] args) {
        // Creating objects of different vehicle types
        Truck truck = new Truck("Ford", "F150", 2020, "Diesel", 2000);
        Car car = new Car("Toyota", "Camry", 2021, "Gasoline", 5);
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR600RR", 2022, "Gasoline", true);

        // Displaying vehicle information
        System.out.println("Truck:");
        displayVehicleInfo(truck);
        System.out.println("Car:");
        displayVehicleInfo(car);
        System.out.println("Motorcycle:");
        displayVehicleInfo(motorcycle);
    }

    // Method to display vehicle information
    public static void displayVehicleInfo(Vehicle vehicle) {
        System.out.println("Make: " + vehicle.getMake());
        System.out.println("Model: " + vehicle.getModel());
        System.out.println("Year: " + vehicle.getYear());
        System.out.println("Fuel Type: " + vehicle.getFuelType());

        if (vehicle instanceof Truck) {
            Truck truck = (Truck) vehicle;
            System.out.println("Max Load: " + truck.getMaxLoad() + " kg");
            System.out.println("Maximum Speed: " + truck.calculateMaxSpeed() + " km/h");
        } else if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            System.out.println("Seating Capacity: " + car.getSeatingCapacity());
            System.out.println("Maximum Speed: " + car.calculateMaxSpeed() + " km/h");
        } else if (vehicle instanceof Motorcycle) {
            Motorcycle motorcycle = (Motorcycle) vehicle;
            System.out.println("Has Fairing: " + (motorcycle.hasFairing() ? "Yes" : "No"));
            System.out.println("Maximum Speed: " + motorcycle.calculateMaxSpeed() + " km/h");
        }

        System.out.println();
    }
}
