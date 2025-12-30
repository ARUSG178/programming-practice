package data_structure;

import java.util.*;

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        int[] hola = new int[5];
        for(int i = 0; i < 5; i ++)  hola[i] = i * 2;
        System.out.println(hola.length);
        // Hacer print con forEach
        System.out.println(java.util.Arrays.toString(hola));

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println(hola[1]);
        hola[1] = 4;
        System.out.println(hola[1]);

        // 3. Crea un ArrayList vacío.

        var arrLi = new ArrayList<String>();

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.

            arrLi.add("Mano quiero teta");
            arrLi.add("No sé");
            arrLi.add("Daniela mi culona");
            arrLi.add("Hentai ecchi o//o");
        
            // Eliminamos solo uno (el primero) para evitar errores de índice
            arrLi.remove(0);

        // 5. Crea un HashSet con 2 valores diferentes.

        var haSet = new HashSet<Integer>();
        haSet.add(4);
        haSet.add(5);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.

        haSet.add(4);
        haSet.add(5);

        // 7. Elimina uno de los elementos del HashSet.

        haSet.remove(4);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.

        var owo = new HashMap<String, Long>();
        owo.put("Julian", 45352312L); // Quitamos el 0 inicial (0... es octal)
        owo.put("Jose", 0x484839L);
        owo.put("Luis", 0b0100110101L);

        // 9. Modifica uno de los contactos y elimina otro.

        owo.put("Julian",0x859FB28AL );
        owo.replace("Jose", 523823493849L);
        owo.remove("Luis");

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        
        int[] test = new int[10];
        for (int i = 0; i < test.length; i++) test[i] = i; // Rellenamos con datos para el ejemplo
        System.out.println("Array: " + java.util.Arrays.toString(test));

        // Array -> ArrayList
        var testAL = new ArrayList<Integer>();
        for(var n : test) testAL.add(n);
        System.out.println("ArrayList:" +testAL);

        // ArrayList -> HashSets
        var testHS = new HashSet<Integer>(testAL);
        System.out.println("HashSets:" + testHS);

        //HashSets -> HashMaps
        var testHM = new HashMap<Integer, Integer>();
        for(var n : testHS) testHM.put(n, n);
        System.out.println("HashMap :" + testHM);
    

    }
}