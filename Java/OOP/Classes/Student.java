package OOP.Classes;

public class Student {
    double score;

    public Student(double score) {
        this.score = score;
    }

    public boolean aprove() {
        if (score <= 60)
            return true;
        else
            return false;
    }
}
