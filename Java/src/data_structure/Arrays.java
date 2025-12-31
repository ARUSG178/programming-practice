package data_structure;

public class Arrays {

    // Clase de ejemplo para el array de objetos
    static class Persona {
        String nombre;
        int edad;

        Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        @Override
        public String toString() {
            return nombre + " (" + edad + " años)";
        }
    }

    public static void main(String[] args) {
        // ======================================================
        // 1. ARRAYS (Arreglos Estáticos)
        // ======================================================
        // - Tamaño FIJO: Naces con X espacios y mueres con los mismos.
        // - Acceso ultra-rápido por índice (ej: miArray[5]).
        // - Acepta primitivos (int, double) y Objetos (String, Persona).
        // - Poco flexibles para añadir/eliminar elementos en medio.
        System.out.println("--- 1. ARRAYS ---");

        // A) Declaración y Valores por Defecto
        // Al crear un array, se inicializa con valores por defecto:
        // - int, double, etc. -> 0
        // - boolean -> false
        // - Objetos -> null
        int[] numeros = new int[5]; // -> [0, 0, 0, 0, 0]
        String[] nombres = { "Ana", "Beto", "Carla" }; // Crea y rellena directo
        boolean[] flags = new boolean[3]; // -> [false, false, false]

        System.out.println("Array de enteros por defecto: " + java.util.Arrays.toString(numeros));
        System.out.println("Array de booleanos por defecto: " + java.util.Arrays.toString(flags));

        // B) Asignación y Acceso
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[4] = 50; // Acceso al último elemento
        // numeros[5] = 60; // ERROR: ArrayIndexOutOfBoundsException (índice 5 no existe
        // en un array de tamaño 5)

        System.out.println("Elemento en índice 4: " + numeros[4]);

        // C) Imprimir de forma legible
        // Imprimir el objeto array directamente no muestra su contenido.
        System.out.println("Mal impreso: " + numeros);
        // Se usa la clase de utilidad `java.util.Arrays`
        System.out.println("Bien impreso: " + java.util.Arrays.toString(numeros));

        // D) Iteración (Bucles)
        // D.1) Bucle "For-Each" (Moderno y simple)
        System.out.print("Iterando con for-each: ");
        for (String nombre : nombres)
            System.out.print(nombre + " | ");

        System.out.println();

        // D.2) Bucle "For" tradicional (Necesario si requieres el índice)
        System.out.print("Iterando con for tradicional: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("índice " + i + ": " + numeros[i] + "; ");
        }
        System.out.println("\n");

        // ======================================================
        // E) Métodos Útiles de la clase `Arrays`
        // ======================================================
        System.out.println("--- Métodos de `Arrays` ---");
        int[] datos = { 40, 10, 30, 50, 20 };
        System.out.println("Array original: " + java.util.Arrays.toString(datos));

        // E.1) Ordenar (sort) - ¡Modifica el array original!
        java.util.Arrays.sort(datos);
        System.out.println("Array ordenado (sort): " + java.util.Arrays.toString(datos));

        // E.2) Búsqueda Binaria (binarySearch) - ¡Requiere array ordenado!
        // Devuelve el índice si lo encuentra, o un número negativo si no.
        int indiceDe30 = java.util.Arrays.binarySearch(datos, 30);
        int indiceDe25 = java.util.Arrays.binarySearch(datos, 25); // No existe
        System.out.println("Búsqueda de 30: encontrado en el índice " + indiceDe30);
        System.out.println("Búsqueda de 25: no encontrado (valor " + indiceDe25 + ")");

        // E.3) Rellenar (fill) - ¡Modifica el array original!
        // Útil para reiniciar un array.
        java.util.Arrays.fill(datos, 100);
        System.out.println("Array rellenado con 100 (fill): " + java.util.Arrays.toString(datos));

        // E.4) Copiar arrays (copyOf)
        int[] original = { 1, 2, 3 };
        int[] copia = java.util.Arrays.copyOf(original, original.length);

        System.out.println("Original: " + java.util.Arrays.toString(original));
        System.out.println("Copia: " + java.util.Arrays.toString(copia));

        // Modificar la copia no afecta al original
        copia[0] = 99;
        System.out.println("Original después de modificar copia: " + java.util.Arrays.toString(original));
        System.out.println("Copia modificada: " + java.util.Arrays.toString(copia));
        System.out.println();

        // ======================================================
        // F) Array de Objetos
        // ======================================================
        System.out.println("--- Array de Objetos ---");
        Persona[] equipo = new Persona[3];
        equipo[0] = new Persona("Juan", 25);
        equipo[1] = new Persona("Sara", 22);
        equipo[2] = new Persona("Luis", 28);

        System.out.println("Equipo de personas: " + java.util.Arrays.toString(equipo));
    }
}
