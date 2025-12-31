package basics;

public class VariablesAndConstants {
    public static void main(String[] args) {

        // --- Fórmulas (Sintaxis) ---
        // Para Variables: tipoDeDato nombreVariable = valor;
        // Para Constantes: final tipoDeDato NOMBRE_CONSTANTE = valor;

        // --- Variables (Valores que pueden cambiar) ---

        // int: Almacena números enteros (sin decimales).
        int edad = 23;
        System.out.println("Mi edad es " + edad);

        // double: Almacena números con decimales (para mayor precisión).
        double precio = 19.99;
        System.out.println(" El precio de estos KZ es: " + precio);
        // char: Almacena un solo carácter (se usan comillas simples '').
        char inicial = 'J';
        System.out.println("La inicial de mi nombre es: " + inicial);

        // boolean: Almacena valores de verdad (true o false).
        boolean esProgramador = true;
        System.out.println("¿Soy programador? " + esProgramador);

        // String: Almacena texto o cadenas de caracteres (se usan comillas dobles "").
        String saludo = "Hola, ¿qué tal?";
        System.out.println("El saludo guardado es: " + saludo);

        // --- Inferencia de tipos (var) ---
        // Desde Java 10, 'var' permite que Java deduzca el tipo de dato
        // automáticamente.
        var pais = "Venezuela"; // El compilador sabe que esto es un String
        System.out.println("País (detectado con var): " + pais);
        var anio = 2024; // El compilador sabe que esto es un int
        System.out.println("Año (detectado con var): " + anio);
        // -- NO PUEDEN CAMBIAR DE TIPO UNA VEZ ASIGNADO --
        // -- ADEMÁS DEBEN DE ASIGNARSELE UN VALOR DE FORMA INMEDIATA

        // --- Constantes (Valores que NO cambian) ---
        // Se usa la palabra clave 'final'. Por convención, los nombres van en
        // MAYÚSCULAS.
        final double PI = 3.14159;
        System.out.println("El valor de la constante PI es: " + PI);
        final int MAX_VIDAS = 3;
        System.out.println("El número máximo de vidas es: " + MAX_VIDAS);

    }
}
