package oop.basics;

public class Product {
    private double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double applyDiscount(double discount) {

        if (discount > 100) {
            System.err.println("You type a invalid value");
            return price;
        }

        return price * (1 - discount / 100);
    }
}
