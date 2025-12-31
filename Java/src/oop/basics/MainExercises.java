package oop.basics;

import java.util.ArrayList;

public class ClassesExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        var book = new Book("El Principito", "Tu mamá");
        book.getInfo();

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        var dog = new Dog();
        dog.Bark();

        // 3. Añade un constructor a la clase Book que reciba title y author.

        // 4. Crea una clase Car con atributos brand y model y un método showData().
        // NOTA: Asegúrate de que el archivo de la clase Car se llame "Car.java" (Mayúscula inicial)
        var car = new Car("Toyota", "Corolla");
        car.showData();

        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
        var student = new Student(79.4);
        if(student.aprove()) System.out.println("Aprove");
        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        var account = new BankAccount();
        account.deposit(500.50);
        // System.out.println(account.balance); // Esto daría ERROR porque es private
        System.out.println("Saldo actual: " + account.getBalance()); // Usamos el Getter
        
        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        var rectangle = new Rectangle(2.0, 30.0);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimetro: " + rectangle.getPerimetro());
        
        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        var worker = new Worker("Hugo", 400);
        System.out.println("Salary: " + worker.getSalary());

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        var persons = new ArrayList<Person>();

        persons.add(new Person("Ana", 20));
        persons.add(new Person("Luis", 25));
        persons.add(new Person("María", 30));

        for(var p : persons) System.out.println(p.getName() + " - " + p.getAge());

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        var product = new Product(85.0);
        System.out.println("Price on BlackFriday -> " + product.applyDiscount(60.5));
    }
}