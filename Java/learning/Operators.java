public class Operators {
    public static void main(String[] args) {

        // --- 1. Operadores Aritméticos (Matemáticas básicas) ---
        System.out.println("--- Aritméticos ---");
        int x = 10;
        int y = 3;
        System.out.println("Suma (10 + 3): " + (x + y));
        System.out.println("Resta (10 - 3): " + (x - y));
        System.out.println("Multiplicación (10 * 3): " + (x * y));
        System.out.println("División entera (10 / 3): " + (x / y)); // Ojo: pierde decimales si son int
        System.out.println("Módulo/Resto (10 % 3): " + (x % y)); // Lo que sobra de la división

        // --- 2. Operadores de Asignación (Modificar y guardar) ---
        System.out.println("\n--- Asignación ---");
        int num = 5;
        System.out.println("Valor inicial: " + num);

        num += 2; // Equivalente a: num = num + 2;
        System.out.println("num += 2 (Suma y asigna): " + num);

        num *= 3; // Equivalente a: num = num * 3;
        System.out.println("num *= 3 (Multiplica y asigna): " + num);

        // --- 3. Operadores Unarios (Incremento, Decremento, Signo) ---
        System.out.println("\n--- Unarios ---");
        int contador = 0;
        contador++; // Incrementa en 1
        System.out.println("contador++: " + contador);

        contador--; // Decrementa en 1
        System.out.println("contador--: " + contador);

        System.out.println("Negación lógica (!true): " + !true); // Invierte booleanos

        // --- 4. Operadores de Comparación (Relacionales) -> Devuelven boolean ---
        System.out.println("\n--- Comparación ---");
        int a = 10;
        int b = 20;
        System.out.println("10 == 20 (¿Es igual?): " + (a == b));
        System.out.println("10 != 20 (¿Es diferente?): " + (a != b));
        System.out.println("10 > 5 (¿Es mayor?): " + (a > 5));
        System.out.println("10 <= 10 (¿Es menor o igual?): " + (a <= 10));

        // --- 5. Operadores Lógicos (Tablas de verdad) ---
        System.out.println("\n--- Lógicos ---");
        boolean tengoHambre = true;
        boolean hayComida = false;

        // AND (&&): Todo debe ser verdadero
        System.out.println("Hambre && Comida (AND): " + (tengoHambre && hayComida));

        // OR (||): Basta con que uno sea verdadero
        System.out.println("Hambre || Comida (OR): " + (tengoHambre || hayComida));
    }
}
