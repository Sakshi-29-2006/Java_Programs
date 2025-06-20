// What is Hierarchical Inheritance in Java?
// Hierarchical Inheritance is a type of inheritance where 
// multiple child classes inherit from a single parent class.

// In other words, one superclass (parent) is extended by two or more subclasses (children).
// Why Use Hierarchical Inheritance?
// Hierarchical inheritance allows:
// Code reusability: Common features are defined once in the parent.
// Separation of concerns: Each child class can have 
// its own specific methods while still using common functionality.
// Scalability: New child classes can be added easily without modifying the parent.

// Parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle has started.");
    }
}

// First child class
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven.");
    }
}

// Second child class
class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is being ridden.");
    }
}

// Third child class
class Truck extends Vehicle {
    void loadCargo() {
        System.out.println("Truck is loading cargo.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();    // inherited from Vehicle
        c.drive();    // specific to Car

        Bike b = new Bike();
        b.start();    // inherited from Vehicle
        b.ride();     // specific to Bike

        Truck t = new Truck();
        t.start();    // inherited from Vehicle
        t.loadCargo();// specific to Truck
    }
}
