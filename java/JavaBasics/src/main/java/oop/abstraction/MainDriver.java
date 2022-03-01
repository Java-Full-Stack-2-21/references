package oop.abstraction;

public class MainDriver {
    public static void main(String[] args) {
        Truck semiTruck = new SemiTruck();
        Car car = new HondaCivicSI();
        car.drive();
    }
}
