package oop.inheritance.ex2;

public class Student extends Person {
    private int grade; 

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    
    public int getGrade() {
        return this.grade;
    }

    public void study() {
        this.grade += 1;
    }
}
