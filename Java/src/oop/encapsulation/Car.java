package oop.encapsulation;

public class Car {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void accelerate(int amount) {
        if (amount > 0) {
            this.speed += amount;
            if (this.speed > 120) {
                this.speed = 120;
            }
        }
    }

    public void brake(int amount) {
        if (amount > 0) {
            this.speed -= amount;
            if (this.speed < 0) {
                this.speed = 0;
            }
        }
    }
}
