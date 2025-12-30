package data_structure;
public class Strings {
    public static void main(String[] args) {

        // --- 1. CREACIÓN Y MEMORIA (String Pool vs Heap) ---
        // String Pool: Java reutiliza memoria si el texto es idéntico.
        String name = "Brais"; 
        // Heap (new): Fuerza la creación de un objeto nuevo en memoria, aunque el texto sea igual.
        String surname = new String("Moure");

        // --- 2. COMPARACIÓN (¡Lo más importante!) ---
        // ERROR COMÚN: Usar '==' compara REFERENCIAS (direcciones de memoria), no el contenido.
        System.out.println("¿Es el mismo objeto? (==): " + (name == "Brais")); // true
        System.out.println("¿Es el mismo objeto? (==): " + (surname == "Moure")); // false (porque usamos new)
        
        // FORMA CORRECTA: Usar '.equals()' compara el CONTENIDO del texto.
        System.out.println("¿Tiene el mismo texto? (.equals): " + surname.equals("Moure")); // true
        System.out.println("Ignorando mayúsculas (.equalsIgnoreCase): " + name.equalsIgnoreCase("brais")); // true

        // --- 3. INFORMACIÓN BÁSICA ---
        String frase = "  Aprender Java es Brutal  ";
        
        System.out.println("\n--- Información ---");
        System.out.println("Texto original: [" + frase + "]");
        System.out.println("Longitud (.length): " + frase.length()); // Cuántos caracteres tiene
        System.out.println("Carácter en índice 5 (.charAt): " + frase.charAt(5)); // Obtener una letra
        System.out.println("¿Está vacío? (.isEmpty): " + frase.isEmpty());

        // --- 4. LIMPIEZA Y TRANSFORMACIÓN ---
        // IMPORTANTE: Los Strings son INMUTABLES. Estos métodos devuelven uno NUEVO, no cambian el original.
        
        System.out.println("\n--- Transformación ---");
        System.out.println("Quitar espacios (.trim): [" + frase.trim() + "]");
        System.out.println("Mayúsculas (.toUpperCase): " + frase.toUpperCase());
        System.out.println("Minúsculas (.toLowerCase): " + frase.toLowerCase());
        System.out.println("Reemplazar (.replace): " + frase.replace("Java", "Python"));
        
        // Subcadena (Cortar texto)
        String limpio = frase.trim(); // Guardamos la versión sin espacios
        System.out.println("Cortar desde índice 9 (.substring): " + limpio.substring(9)); // "es Brutal"
        System.out.println("Cortar rango 0-8 (.substring): " + limpio.substring(0, 8)); // "Aprender"

        // --- 5. BÚSQUEDA ---
        System.out.println("\n--- Búsqueda ---");
        System.out.println("¿Contiene 'Java'? (.contains): " + frase.contains("Java"));
        // Truco: Para buscar sin importar mayúsculas, convierte todo a minúsculas primero:
        System.out.println("Búsqueda insensible: " + frase.toLowerCase().contains("java")); 
        
        System.out.println("Posición de 'B' (.indexOf): " + frase.indexOf('B')); // Devuelve el índice

        // --- 6. FORMATO Y ARRAYS ---
        System.out.println("\n--- Otros ---");
        var age = 23;
        // String.format permite inyectar variables en un texto (%s texto, %d numero)
        String mensaje = String.format("Hola %s, tienes %d años.", name, age);
        System.out.println("Formato: " + mensaje);

        // Split (Separar texto en un Array)
        String lista = "Pan,Leche,Huevos";
        String[] productos = lista.split(","); // Corta donde haya una coma
        System.out.println("Primer producto (.split): " + productos[0]); // Pan
    }
}