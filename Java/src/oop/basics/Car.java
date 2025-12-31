package oop.basics;

public class Car {
    String brand, model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void showData() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}
