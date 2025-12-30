package OOP.Classes;

public class Rectangle {
    private double base;
    private double altura;

    // Constructor
    public Rectangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Getter para base
    public double getBase() {
        return base;
    }

    // Getter para altura
    public double getAltura() {
        return altura;
    }

    // Método para calcular el área
    public double getArea() {
        return base * altura;
    }

    // Método para calcular el perímetro
    public double getPerimetro() {
        return 2 * (base + altura);
    }
}