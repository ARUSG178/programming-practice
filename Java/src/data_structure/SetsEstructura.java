package data_structure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsEstructura {

    public static void main(String[] args) {
        // ====================================================== 
        // 3. SETS (Conjuntos)
        // ====================================================== 
        // - NO admiten elementos DUPLICADOS.
        // - Su principal fortaleza es la RAPIDEZ para comprobar si un elemento existe (`contains`).
        // - La interfaz principal es `Set`, con varias implementaciones importantes.

        System.out.println("--- 3. SETS: Implementaciones ---");

        // A) HashSet:
        // - El más rápido.
        // - NO garantiza ningún orden. Los elementos parecen estar en un orden aleatorio.
        // - Es la implementación más común.
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Manzana");
        hashSet.add("Banana");
        hashSet.add("Naranja");
        hashSet.add("Manzana"); // Se ignora, no se añade porque ya existe.
        System.out.println("HashSet (sin orden garantizado): " + hashSet);

        // B) LinkedHashSet:
        // - Mantiene el ORDEN DE INSERCIÓN.
        // - Un poco más lento que HashSet, pero predecible.
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Manzana");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Naranja");
        System.out.println("LinkedHashSet (orden de inserción): " + linkedHashSet);

        // C) TreeSet:
        // - Mantiene los elementos ORDENADOS NATURALMENTE (alfabético, numérico).
        // - Es el más lento de los tres, pero útil cuando necesitas los datos ordenados siempre.
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Manzana");
        treeSet.add("Banana");
        treeSet.add("Naranja");
        System.out.println("TreeSet (orden natural/alfabético): " + treeSet);
        System.out.println();


        // ====================================================== 
        // D) Operaciones Comunes
        // ====================================================== 
        System.out.println("--- Operaciones Comunes ---");
        Set<Integer> numeros = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("Set inicial: " + numeros);

        // D.1) Añadir y Eliminar
        numeros.add(5);
        numeros.remove(2);
        System.out.println("Después de añadir 5 y eliminar 2: " + numeros);

        // D.2) Consultas
        System.out.println("¿El set contiene el 3? " + numeros.contains(3));
        System.out.println("Tamaño del set: " + numeros.size());
        
        // Iterar sobre un set
        System.out.print("Iterando sobre el set: ");
        for (Integer num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // ====================================================== 
        // E) Operaciones de Conjuntos (Álgebra)
        // ====================================================== 
        System.out.println("--- Operaciones de Conjuntos ---");
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);

        // E.1) Unión (addAll) - Combina ambos sets sin duplicados
        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println("Unión (A U B): " + union); // -> [1, 2, 3, 4, 5, 6]

        // E.2) Intersección (retainAll) - Se queda solo con los elementos en común
        Set<Integer> interseccion = new HashSet<>(setA);
        interseccion.retainAll(setB);
        System.out.println("Intersección (A ∩ B): " + interseccion); // -> [3, 4]

        // E.3) Diferencia (removeAll) - Elimina de A los elementos que también están en B
        Set<Integer> diferencia = new HashSet<>(setA);
        diferencia.removeAll(setB);
        System.out.println("Diferencia (A - B): " + diferencia); // -> [1, 2]
        
        // Limpiar un set
        numeros.clear();
        System.out.println("\nSet después de clear(): " + numeros);
        System.out.println("¿Está vacío ahora? " + numeros.isEmpty());
    }
}