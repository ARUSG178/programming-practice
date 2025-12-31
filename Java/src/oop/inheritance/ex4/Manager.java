package oop.inheritance.ex4;

public class Manager extends Employee {
    private String departament;

    public Manager(String name, double salary, String departament) {
        super(name, salary);
        this.departament = departament;
    }

    public String getDepartament() {
        return this.departament;
    }
}
