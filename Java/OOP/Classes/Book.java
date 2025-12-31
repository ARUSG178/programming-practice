package OOP.Classes;

public class Book {
    String title, autor;

    public Book(String title, String autor) {
        this.title = title;
        this.autor = autor;
    }

    public void getInfo() {
        System.out.println("I'm " + title + "And my autor is: " + autor);
    }
}
