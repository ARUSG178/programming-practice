package oop.inheritance.ex1;

public class Car extends Vehicle {
    private String brand = "Toyota";

    public void honk(){
        super.move();
        System.out.println("The " + brand + " is hoking btw");
    }

    @Override
    public void describe() {
        System.out.println("This is a car.");
    }
}
