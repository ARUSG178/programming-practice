import java.util.ArrayList;

public class FunctionsExercises {

    public static void main(String[] args) {
        // ZONA DE PRUEBAS (Aquí llamamos a las funciones)

        // 1. Bievenida
        welcome();

        // 2. Saludar
        saludar("Jesús");

        // 3. Restar
        System.out.println("Resta de 10 - 4: " + restar(10, 4));

        // 4. Cuadrado
        System.out.println("Cuadrado de 5: " + cuadrado(5));

        // 5. Par o Impar
        System.out.print("El número 7 es: ");
        esPar(7); // Esta función ya hace el print por dentro

        // 6. Mayor de edad
        System.out.println("¿Es mayor de edad con 17? " + esMayor(17));

        // 7. Longitud de cadena
        System.out.println("Longitud de 'Java': " + longitudString("Java"));

        // 8. Media de un array
        int[] misNotas = { 15, 18, 20, 12 };
        System.out.println("Media de notas: " + calcularMedia(misNotas));

        // 9. Factorial
        System.out.println("Factorial de 5: " + factorial(5));

        // 10. Recorrer ArrayList
        var listaCompras = new ArrayList<String>();
        listaCompras.add("Leche");
        listaCompras.add("Pan");
        listaCompras.add("Huevos");
        System.out.println("--- Lista de Compras ---");
        imprimirLista(listaCompras);
    }

    // ==============================================================
    // ZONA DE DEFINICIÓN DE FUNCIONES (Fuera del main)
    // ==============================================================

    // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde
    // cero!".
    public static void welcome() {
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    // 2. Escribe una función que reciba un nombre como parámetro y salude a esa
    // persona.
    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre);
    }

    // 3. Haz un método que reciba dos números enteros y devuelva su resta.
    public static int restar(int a, int b) {
        return a - b;
    }

    // 4. Crea un método que calcule el cuadrado de un número (n * n).
    // public static int cuadrado(int n) { ... }
    public static int cuadrado(int n) {
        return n * n;
    }

    // 5. Escribe una función que reciba un número y diga si es par o impar.
    // public static void esPar(int n) { ... }
    public static void esPar(int n) {
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    // 6. Crea un método que reciba una edad y retorne true si es mayor de edad.
    // public static boolean esMayor(int edad) { ... }
    public static boolean esMayor(int edad) {
        return edad >= 18;
    }

    // 7. Implementa una función que reciba una cadena y retorne su longitud.
    // public static int longitudString(String texto) { ... }
    public static int longitudString(String texto) {
        return texto.length();
    }

    // 8. Crea un método que reciba un array de enteros, calcula su media y lo
    // retorna.
    // public static double calcularMedia(int[] numeros) { ... }
    public static double calcularMedia(int[] numeros) {
        double prom = 0;
        int idx = 0;
        for (var uwu : numeros) {
            idx++;
            prom += uwu;
        }
        return prom / idx;
    }

    // 9. Escribe un método que reciba un número y retorna su factorial.
    // public static long factorial(int n) { ... }
    public static long factorial(int n) {
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }

    // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando
    // cada elemento.
    public static void imprimirLista(ArrayList<String> lista) {
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}