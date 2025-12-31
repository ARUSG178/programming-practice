package oop.inheritance.ex9;
import oop.inheritance.ex1.Vehicle;

public class Bike extends Vehicle {
    @Override
    public void describe() {
        System.out.println("This is a bike.");
    }
}
