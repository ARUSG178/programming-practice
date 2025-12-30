package data_structure;

import java.util.Arrays;

public class Matrices {

    public static void main(String[] args) {
        // ======================================================
        // 5. MATRICES (Arrays Multidimensionales)
        // ====================================================== 
        // - Son "arrays de arrays". Un array 2D es un array donde cada elemento es, a su vez, otro array.
        // - Se usan para representar tablas, tableros, cuadrículas, etc.
        // - Se accede a los elementos mediante índices de fila y columna: `matriz[fila][columna]`.

        System.out.println("--- 5. MATRICES ---");

        // A) Matriz Rectangular (la más común)
        // Todas las filas tienen la misma cantidad de columnas.
        System.out.println("\n--- Matriz Rectangular ---");
        
        // A.1) Declaración e Inicialización
        int[][] matrizRectangular = new int[3][4]; // 3 filas, 4 columnas
        
        // Asignación manual
        matrizRectangular[0][0] = 1;
        matrizRectangular[1][2] = 5;
        // El resto de elementos se inicializan a 0 por defecto.

        // A.2) Declaración con valores directos
        String[][] tablero = {
            {"X", "O", "X"},
            {"O", "X", "O"},
            {"X", "O", "X"}
        };

        // B) Iteración de una Matriz
        System.out.println("Recorriendo el tablero de 3x3:");
        // El bucle externo recorre las filas
        for (int i = 0; i < tablero.length; i++) {
            // El bucle interno recorre las columnas de la fila actual
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }

        // C) Impresión de Matrices con `Arrays.deepToString()`
        // Imprimir una matriz directamente no funciona bien.
        System.out.println("\nMal impreso: " + matrizRectangular);
        // `Arrays.toString()` solo funciona para arrays de 1D.
        System.out.println("Impresión regular de arrays: " + Arrays.toString(matrizRectangular));
        // Para matrices (arrays de arrays), se debe usar `deepToString()`.
        System.out.println("Bien impreso con deepToString(): " + Arrays.deepToString(matrizRectangular));
        System.out.println();

        
        // ======================================================
        // D) Matriz Irregular (Jagged Array)
        // ======================================================
        // - Cada fila puede tener un número diferente de columnas.
        System.out.println("--- Matriz Irregular (Jagged Array) ---");
        
        int[][] matrizIrregular = new int[4][]; // Solo especificamos el número de filas
        
        // Ahora, creamos cada fila (array) con un tamaño diferente
        matrizIrregular[0] = new int[1];
        matrizIrregular[1] = new int[3];
        matrizIrregular[2] = new int[2];
        matrizIrregular[3] = new int[4];

        // Rellenamos con algunos datos
        matrizIrregular[1][2] = 10;
        matrizIrregular[3][0] = 20;

        System.out.println("Matriz irregular impresa con deepToString():");
        System.out.println(Arrays.deepToString(matrizIrregular));
        System.out.println();

        // ======================================================
        // E) Arrays de 3 o más dimensiones
        // ======================================================
        // - La misma lógica se extiende a más dimensiones (cubos, etc.).
        System.out.println("--- Array de 3 Dimensiones ---");
        
        // Declaramos un "cubo" de 2x3x4
        int[][][] cubo = new int[2][3][4];
        
        cubo[0][1][2] = 99; // Accedemos a un punto en el espacio 3D
        
        System.out.println("Cubo 3D impreso con deepToString():");
        System.out.println(Arrays.deepToString(cubo));
    }
}
