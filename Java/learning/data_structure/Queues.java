package data_structure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queues {

    public static void main(String[] args) {
        // ======================================================
        // 8. COLAS (Queues)
        // ======================================================
        // ... (explicaciones anteriores) ...

        System.out.println("--- 8. Colas (con LinkedList) ---");

        // ... (ejemplos estáticos) ...
        
        // ======================================================
        // C) Ingreso de Datos por Teclado (Scanner)
        // ======================================================
        System.out.println("\n--- C. Ejemplo Interactivo: Cola de Soporte Técnico (FIFO) ---");
        Scanner scanner = new Scanner(System.in);
        Queue<String> tickets = new LinkedList<>();
        String opcion = "";
        int ticketCounter = 1;

        while (!opcion.equals("4")) {
            System.out.println("\n--- MENÚ DE SOPORTE ---");
            System.out.println("1. Nuevo ticket (cliente se forma en la cola)");
            System.out.println("2. Atender siguiente ticket (el primero en la cola)");
            System.out.println("3. Ver quién es el siguiente");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    String nuevoTicket = "Ticket #" + ticketCounter++;
                    tickets.offer(nuevoTicket); // Usamos offer, es más seguro
                    System.out.println("'" + nuevoTicket + "' ha entrado en la cola. " +
                                       "Hay " + tickets.size() + " ticket(s) esperando.");
                    break;
                case "2":
                    if (tickets.isEmpty()) {
                        System.out.println("No hay tickets en la cola.");
                    } else {
                        String ticketAtendido = tickets.poll(); // Usamos poll, es más seguro
                        System.out.println("Atendiendo: '" + ticketAtendido + "'.");
                    }
                    break;
                case "3":
                    if (tickets.isEmpty()) {
                        System.out.println("No hay tickets en la cola.");
                    } else {
                        System.out.println("El siguiente ticket a atender es: '" + tickets.peek() + "'");
                    }
                    break;
                case "4":
                    System.out.println("Cerrando el sistema de soporte.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
        scanner.close();
    }
}
