package data_structure;

import java.util.LinkedList;

public class LinkedListPractice {

    public static void main(String[] args) {
        // ======================================================
        // 6. LINKEDLIST (Lista Doblemente Enlazada)
        // ======================================================
        // En Java, la clase `java.util.LinkedList` es una implementación de una lista
        // DOBLEMENTE enlazada. Esto significa que cada elemento (o "nodo") tiene una
        // referencia tanto al elemento siguiente como al anterior. No hay una clase
        // separada para listas simplemente enlazadas en la biblioteca estándar.

        // Características principales:
        // - Rápida para AÑADIR y ELIMINAR elementos, especialmente en los extremos (inicio y final).
        // - Lenta para ACCEDER a un elemento por índice (ej: get(500)), ya que debe
        //   recorrer la lista desde el principio o el final hasta llegar a esa posición.
        // - Consume un poco más de memoria que un ArrayList porque cada nodo almacena los datos
        //   y dos referencias (anterior y siguiente).

        System.out.println("--- 6. LinkedList ---");

        // A) Declaración
        // Se puede declarar como List, pero si quieres usar métodos específicos de LinkedList,
        // debes declararla con su clase concreta.
        LinkedList<String> animales = new LinkedList<>();

        // B) Operaciones de Lista Estándar
        animales.add("Perro");    // Añade al final
        animales.add("Gato");
        animales.add(1, "Loro"); // Añade en un índice específico
        System.out.println("LinkedList como una lista normal: " + animales);

        // C) Operaciones Específicas de LinkedList (y Deque)
        // Estas operaciones son muy eficientes porque no requieren recorrer la lista.
        System.out.println("\n--- Operaciones de los extremos ---");

        // C.1) Añadir en los extremos
        animales.addFirst("Caballo"); // Añade al inicio
        animales.addLast("Pez");      // Añade al final (igual que .add())
        System.out.println("Después de addFirst y addLast: " + animales);

        // C.2) Obtener elementos de los extremos (sin eliminarlos)
        System.out.println("Primer elemento (getFirst): " + animales.getFirst());
        System.out.println("Último elemento (getLast): " + animales.getLast());

        // C.3) Eliminar elementos de los extremos
        String primerAnimal = animales.removeFirst(); // Elimina y devuelve el primer elemento
        String ultimoAnimal = animales.removeLast();  // Elimina y devuelve el último elemento
        System.out.println("Se eliminó del inicio a: " + primerAnimal);
        System.out.println("Se eliminó del final a: " + ultimoAnimal);
        System.out.println("Lista después de eliminar de los extremos: " + animales);
        
        // D) ¿Cuándo usar LinkedList vs ArrayList?
        // - Usa ArrayList si:
        //   - Principalmente lees datos por índice (ej: `get(i)`).
        //   - El tamaño de la lista no cambia muy a menudo.
        // - Usa LinkedList si:
        //   - Haces muchas inserciones y eliminaciones en CUALQUIER parte de la lista.
        //   - La usas como una Pila (Stack) o una Cola (Queue), ya que `addFirst/removeFirst`
        //     y `addLast/removeLast` son operaciones muy rápidas.
    }
}
