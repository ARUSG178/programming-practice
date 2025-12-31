package oop.encapsulation;

public class Student {
    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isPassed() {
        return this.grade >= 60;
    }
}
