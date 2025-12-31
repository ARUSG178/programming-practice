package oop.encapsulation;

public class EncapsulationExercises {
    public static void main(String[] args) {
        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
        System.out.println("--- Ejercicio 1: Person ---");
        Person person = new Person();
        person.setName("Alice");
        person.setAge(30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println();

        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
        System.out.println("--- Ejercicio 2: Product ---");
        Product product = new Product();
        product.setPrice(50.0);
        System.out.println("Price: " + product.getPrice());
        product.setPrice(-10.0); // Intento de precio inválido
        System.out.println();

        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
        System.out.println("--- Ejercicio 3: BankAccount ---");
        BankAccount account = new BankAccount();
        account.deposit(1000.0);
        System.out.println("Balance inicial: " + account.getBalance());
        account.withdraw(500.0);
        System.out.println("Balance después del retiro: " + account.getBalance());
        account.withdraw(600.0); // Retiro inválido
        System.out.println();

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
        System.out.println("--- Ejercicio 4: Book ---");
        Book book = new Book("The Lord of the Rings");
        System.out.println("Title: " + book.getTitle());
        // book.setTitle("New Title"); // Error de compilación, como se esperaba
        System.out.println();

        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
        System.out.println("--- Ejercicio 5: Temperature ---");
        Temperature temp = new Temperature();
        temp.setCelsius(25.5);
        System.out.println("Celsius: " + temp.getCelsius());
        temp.setCelsius(150); // Temperatura inválida
        System.out.println();

        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
        System.out.println("--- Ejercicio 6: User ---");
        User user = new User();
        user.setUsername("testuser");
        user.setPassword("password123");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password check (correcta): " + user.checkPassword("password123"));
        System.out.println("Password check (incorrecta): " + user.checkPassword("wrongpassword"));
        System.out.println();

        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
        System.out.println("--- Ejercicio 7: Employee ---");
        Employee employee = new Employee();
        employee.setSalary(50000);
        System.out.println("Salario inicial: " + employee.getSalary());
        employee.raiseSalary(10); // Aumento del 10%
        System.out.println("Salario con aumento: " + employee.getSalary());
        employee.raiseSalary(-5); // Intento de aumento negativo
        System.out.println();

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
        System.out.println("--- Ejercicio 8: Rectangle ---");
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(5);
        System.out.println("Área: " + rectangle.calculateArea());
        System.out.println();

        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
        System.out.println("--- Ejercicio 9: Student ---");
        Student student1 = new Student();
        student1.setGrade(75);
        System.out.println("Nota: " + student1.getGrade() + " - Aprobado: " + student1.isPassed());
        Student student2 = new Student();
        student2.setGrade(59);
        System.out.println("Nota: " + student2.getGrade() + " - Aprobado: " + student2.isPassed());
        System.out.println();

        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
        System.out.println("--- Ejercicio 10: Car ---");
        Car car = new Car();
        System.out.println("Velocidad inicial: " + car.getSpeed());
        car.accelerate(60);
        System.out.println("Velocidad después de acelerar: " + car.getSpeed());
        car.accelerate(80); // Intenta superar el máximo
        System.out.println("Velocidad después de acelerar al máximo: " + car.getSpeed());
        car.brake(30);
        System.out.println("Velocidad después de frenar: " + car.getSpeed());
        car.brake(100); // Intenta bajar de 0
        System.out.println("Velocidad después de frenar al mínimo: " + car.getSpeed());
    }
}
