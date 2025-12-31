package basics;

import java.util.Scanner; // 1. Importar la herramienta

public class ConditionalExercises {

    public static void main(String[] args) {

        // 2. Crear el objeto Scanner (equivalente a preparar el cin)
        // ¿Por qué Scanner? Porque System.in lee bytes crudos.
        // Scanner es un "traductor" que convierte esos bytes a int, double, String,
        // etc.
        Scanner sc = new Scanner(System.in);

        // 1. Establece la edad de un usuario y muestra si puede votar
        System.out.println("\n--- 1. Votar ---");
        System.out.print("Por favor, introduce tu edad: ");
        int manuel = sc.nextInt(); // 3. Leer el dato (int)

        if (manuel >= 18)
            System.out.println("Si puede votar manito");

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        System.out.println("\n--- 2. Comparar números ---");
        System.out.print("Introduce el primer número: ");
        int comp1 = sc.nextInt(); // Reutilizamos el scanner para leer otro entero
        System.out.print("Introduce el segundo número: ");
        int comp2 = sc.nextInt();

        if (comp1 == comp2)
            System.out.println("Son iguales");
        else
            System.out.println("Noporolo, no lo son");

        // 3. Dado un número, verifica si es positivo, negativo o cero
        System.out.println("\n--- 3. Signo ---");
        System.out.print("Introduce un número: ");
        int numSigno = sc.nextInt();

        if (numSigno < 0)
            System.out.println("Negativo");
        else if (numSigno > 0)
            System.out.println("Positivo");
        else
            System.out.println("Igual a cero");

        // 4. Crea un programa que diga si un número es par o impar.
        System.out.println("\n--- 4. Par o Impar ---");
        System.out.print("Introduce un número: ");
        int numPar = sc.nextInt();

        if (numPar % 2 == 0)
            System.out.println("Es par");
        else
            System.out.println("Es impar");

        // 5. Verifica si un número está en el rango de 1 a 100.
        System.out.println("\n--- 5. Rango 1-100 ---");
        System.out.print("Introduce un número: ");
        int numRango = sc.nextInt();

        if (numRango >= 1 && numRango <= 100)
            System.out.println("Está en el rango");
        else
            System.out.println("Fuera de rango");

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con
        // switch.
        System.out.println("\n--- 6. Día de la semana ---");
        System.out.print("Introduce un día (1-7): ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día inválido");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o
        // "Suspenso" según la nota (0-100).
        System.out.println("\n--- 7. Notas ---");
        System.out.print("Introduce tu nota (0-100): ");
        int nota = sc.nextInt();

        if (nota >= 90)
            System.out.println("Sobresaliente");
        else if (nota >= 50)
            System.out.println("Aprobado");
        else
            System.out.println("Suspenso");

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al
        // menos 15 años o ir acompañado.
        System.out.println("\n--- 8. Cine ---");
        System.out.print("Introduce tu edad: ");
        int edadCine = sc.nextInt();
        System.out.print("¿Estás acompañado? (true/false): ");
        // nextBoolean() lee literalmente "true" o "false" escrito por el usuario
        boolean acompañado = sc.nextBoolean();

        if (edadCine >= 15 || acompañado)
            System.out.println("Puedes entrar al cine");
        else
            System.out.println("No puedes pasar");

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        System.out.println("\n--- 9. Vocal o Consonante ---");
        System.out.print("Introduce una letra: ");
        // TRUCO: Scanner no tiene nextChar(). Leemos la palabra (.next()) y cogemos la
        // primera letra (.charAt(0))
        char letra = sc.next().charAt(0);

        // Comparación directa de caracteres
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
            System.out.println("Es vocal");
        else
            System.out.println("Es consonante");

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        System.out.println("\n--- 10. Mayor de tres ---");
        System.out.print("Introduce número A: ");
        int a = sc.nextInt();
        System.out.print("Introduce número B: ");
        int b = sc.nextInt();
        System.out.print("Introduce número C: ");
        int c = sc.nextInt();

        if (a > b && a > c)
            System.out.println("El mayor es A: " + a);
        else if (b > a && b > c)
            System.out.println("El mayor es B: " + b);
        else
            System.out.println("El mayor es C: " + c);

        // 11. Ver si es hombre o mujer según la entrada
        System.out.println("\n--- 11. Género ---");
        System.out.print("Introduce tu género (M/F): ");
        String genero = sc.next();

        // IMPORTANTE: En Java los Strings se comparan con .equals(), NO con ==
        // .equalsIgnoreCase() permite que "m" sea igual a "M" (ignora mayúsculas)
        if (genero.equalsIgnoreCase("M"))
            System.out.println("Es Hombre");
        else if (genero.equalsIgnoreCase("F"))
            System.out.println("Es Mujer");
        else
            System.out.println("Otro / No especificado");

        sc.close(); // 4. Cerrar el scanner al final para liberar memoria
    }
}
