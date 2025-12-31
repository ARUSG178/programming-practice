package oop.inheritance;

import java.util.ArrayList;

import oop.inheritance.ex1.Car;
import oop.inheritance.ex1.Vehicle;
import oop.inheritance.ex2.Student;
import oop.inheritance.ex3.Animal;
import oop.inheritance.ex3.Bird;
import oop.inheritance.ex3.Eagle;
import oop.inheritance.ex3.Dog;
import oop.inheritance.ex3.Cat;
import oop.inheritance.ex4.Manager;
import oop.inheritance.ex5.Circle;
import oop.inheritance.ex5.Rectangle;
import oop.inheritance.ex7.Phone;
import oop.inheritance.ex8.SavingsAccount;
import oop.inheritance.ex9.Bike;
import oop.inheritance.ex9.Truck;

public class inheritanceExercises {
    public static void main(String[] args) {

        // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
        System.out.println("-- CARRO SONANDO --");
        var car = new Car();
        car.honk();
        System.out.println();

        // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().
        System.out.println("-- ESTUDIANTE --");
        var student = new Student("Omar", 12, 6);
        System.out.println("Grade: " + student.getGrade());
        student.study();
        System.out.println("Grade: " + student.getGrade());
        System.out.println();

        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
        System.out.println("-- ANIMAL HACIENDO SONIDO  --");
        var animal = new Animal();
        animal.makeSound();
        var dog = new Dog();
        dog.makeSound();
        var cat = new Cat();
        cat.makeSound();
        System.out.println();

        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.
        System.out.println("-- EMPLEADO  --");
        var manager = new Manager("Jorelio", 240.35, "Virginidad");
        System.out.println("Nombre: " + manager.getName());
        System.out.println("Nombre: " + manager.getSalary());
        System.out.println("Nombre: " + manager.getDepartament());
        System.out.println();

        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.
        System.out.println("-- EMPLEADO  --");
        var circle = new Circle(45);
        System.out.println("Radius: " + circle.calculateArea());
        var rectangle = new Rectangle(34.5, 53.3);
        System.out.println("Radius: " + rectangle.calculateArea());
        System.out.println();

        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
        System.out.println("-- AVES  --");
        var eagle = new Eagle();
        eagle.fly();
        System.out.println();

        // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
        System.out.println("-- DISPOSITIVOS  --");
        new Phone();
        System.out.println();

        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().
        System.out.println("-- CUENTA DE AHORROS --");
        var savings = new SavingsAccount(1000, 10);
        savings.deposit(500);
        savings.addInterest();
        System.out.println("Balance: " + savings.getBalance());
        System.out.println();

        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.
        System.out.println("-- VEHICULOS --");
        var vehicle = new Vehicle();
        vehicle.describe();
        var carB = new Car();
        carB.describe();
        var bike = new Bike();
        bike.describe();
        var truck = new Truck();
        truck.describe();
        System.out.println();

        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
        System.out.println("-- ARRAYLIST DE ANIMALES --");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Bird());

        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
