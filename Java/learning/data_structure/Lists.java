package data_structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

public class Lists {

    public static void main(String[] args) {
        // ====================================================== 
        // 2. LISTAS (Implementaciones: ArrayList y LinkedList)
        // ====================================================== 
        // - Tamaño DINÁMICO: Crecen y decrecen según se necesite.
        // - Mantienen el ORDEN de inserción.
        // - Admiten elementos DUPLICADOS.
        // - Deben usar Clases Wrapper (Integer, Double) en lugar de primitivos (int, double).
        System.out.println("--- 2. LISTAS ---");

        // A) Declaración: Programar hacia la interfaz 'List'
        // Es una buena práctica declarar con la interfaz 'List' y luego instanciar la clase concreta.
        // Esto hace tu código más flexible para cambiar de implementación si es necesario.
        
        // A.1) ArrayList:
        // - Rápido para acceso aleatorio (get).
        // - Lento para añadir/eliminar en medio (requiere reorganizar el array interno).
        // - Generalmente es la opción por defecto.
        List<String> lenguajes = new ArrayList<>();
        lenguajes.add("Java");
        lenguajes.add("Python");
        lenguajes.add("JavaScript");
        lenguajes.add(1, "Go"); // Añadir en un índice específico

        // A.2) LinkedList:
        // - Rápido para añadir/eliminar elementos en cualquier parte.
        // - Lento para acceso aleatorio (debe recorrer los nodos).
        // - Útil para colas (Queue) o cuando hay muchas inserciones/eliminaciones.
        List<String> paises = new LinkedList<>();
        paises.add("España");
        paises.add("México");
        paises.add("Colombia");


        // B) Operaciones Comunes
        System.out.println("\n--- Operaciones Comunes con ArrayList ---");
        System.out.println("Lista inicial de lenguajes: " + lenguajes);

        // B.1) Añadir y Obtener
        lenguajes.add("Java"); // Se permiten duplicados
        System.out.println("Después de añadir 'Java' de nuevo: " + lenguajes);
        System.out.println("Elemento en el índice 2: " + lenguajes.get(2));

        // B.2) Modificar y Eliminar
        lenguajes.set(0, "Java 21"); // Modificar el elemento en el índice 0
        lenguajes.remove("Python"); // Eliminar por objeto
        lenguajes.remove(2);        // Eliminar por índice
        System.out.println("Después de modificar y eliminar: " + lenguajes);

        // B.3) Consultas
        System.out.println("¿La lista contiene 'Go'? " + lenguajes.contains("Go"));
        System.out.println("Tamaño de la lista: " + lenguajes.size());
        System.out.println("¿La lista está vacía? " + lenguajes.isEmpty());


        // C) Iteración (Formas de recorrer una lista)
        System.out.println("\n--- Formas de Iterar ---");
        // C.1) Bucle For-Each (el más común)
        System.out.print("Con for-each: ");
        for (String lenguaje : lenguajes) {
            System.out.print(lenguaje + " / ");
        }
        System.out.println();

        // C.2) Iterador (Iterator) - ¡La forma SEGURA de eliminar mientras se itera!
        System.out.print("Con Iterator (eliminando 'Java 21'): ");
        Iterator<String> iterador = lenguajes.iterator();
        while (iterador.hasNext()) {
            String lenguaje = iterador.next();
            if (lenguaje.equals("Java 21")) {
                iterador.remove(); // Correcto: usa el remove() del iterador
            } else {
                System.out.print(lenguaje + " / ");
            }
        }
        // for (String lenguaje : lenguajes) { if (lenguaje.equals("Java 21")) lenguajes.remove(lenguaje); } // ¡ERROR! ConcurrentModificationException
        System.out.println("\nLista después de iterar y eliminar: " + lenguajes);


        // D) Clase de Utilidad `Collections`
        System.out.println("\n--- Utilidades de `Collections` ---");
        List<Integer> numeros = new ArrayList<>(List.of(50, 10, 40, 20, 30));
        System.out.println("Números originales: " + numeros);

        Collections.sort(numeros); // Ordena la lista
        System.out.println("Números ordenados: " + numeros);

        Collections.reverse(numeros); // Invierte el orden
        System.out.println("Números invertidos: " + numeros);

        Collections.shuffle(numeros); // Desordena aleatoriamente
        System.out.println("Números desordenados: " + numeros);


        // E) Convertir a Array
        System.out.println("\n--- Convertir Lista a Array ---");
        String[] arrayDeLenguajes = lenguajes.toArray(new String[0]);
        System.out.println("Array resultante: " + Arrays.toString(arrayDeLenguajes));

        // Limpiar la lista
        lenguajes.clear();
        System.out.println("Lista después de clear(): " + lenguajes);
        System.out.println("¿Vacía ahora? " + lenguajes.isEmpty());
    }
}
