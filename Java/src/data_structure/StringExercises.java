package data_structure;

public class StringExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadeans de texto.
        var array_1 = "El que me concatene ";
        var array_2 = "es tremendo galan";
        System.out.println(array_1 + array_2);
        
        // 2. Muesrtra la longitud de una cadena de texto.
        System.out.println(array_1.length());
        
        // 3. Muestra el primer y último carácter de un string.
        System.out.println("Primer char: " +  array_1.charAt(0) + "último char: " + array_1.charAt(array_1.length() - 1));
        
        // 4. Convierte a mayúsculas y minúsculas un string
        System.out.println(array_1.toUpperCase());
        System.out.println(array_1.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra
        System.out.println(array_1.contains("El que"));

        // 6. Formatea un string con un entero.
        var num = 15;
        String mensaje = String.format("El número ganador es el: %d", num);
        System.out.println(mensaje);

        // 7. ¿Por qué usar format? Para controlar decimales.
        double valor = 12.3456789;
        // Concatener (+) imprime todo el chorrero de números feo
        System.out.println("Sin formato: " + valor); 
        // Format (%.2f) redondea a 2 decimales automáticamente. ¡Esto no lo hace el +!
        System.out.println(String.format("Con formato (2 decimales): %.2f", valor));

        // 8. Sustitute todos los eespacios en blanco de un string
        System.out.println(array_1.replace(" ", "-"));

        // 9. Comprueba si dos string son iguales.
        System.out.println(array_2.equals(array_1));

        //10. Comprueba si dos strings tiene la misma longitud
        if(array_1.length() == array_2.length())
            System.out.println("Mano son iguales, no lo digas");
        else
            System.err.println("No lo digas, que no lo son");

    }

}
