public class Vehicle {
    public void drive(){
        System.out.println("Vehicle is being driven");
    }
    public static void main(String[] args){
        Car c = new Car();
        Bike b = new Bike();
        Vehicle v = new Vehicle();
        c.drive();
        c.c1method();
        b.drive();
        b.c2method();
        v.drive();
    }
}
class Car extends Vehicle{
    public void c1method(){
        System.out.println("Car is being driven");
    }
}
class Bike extends Vehicle{
    public void c2method(){
        System.out.println("Bike is being driven");
    }
}