package basics;

public class SecondsExcercises {
    public static void main(String[] args) {
        // 1. Declara una variable con mi nombre
        var name = "Jesús";
        System.out.println(name);
        // 2. Declarar int con mi edad
        var age = 23;
        System.out.println(age);
        // 3. Altura en metros
        double stature = 1.73;
        System.out.println(stature);
        // 4. Tipo boolean
        boolean culo = true;
        if (culo)
            System.out.print("Me gusta programar");
        // 5. Constante con mi email
        final var EMAIL = "aaron172014@gmail.com";
        if (!culo)
            System.out.println(EMAIL);
        // 6. Crea una variable char con inicial
        var myName = 'j';
        if (myName != 'j')
            System.out.print("Mano me gusta la teta");
        // 7. String con localidad, cambiar valor, imprimir
        var locality = "Caracas";
        System.out.println(locality);
        locality = "Curazao";
        System.out.println(locality);
        // 8. Suma print
        var a = 5;
        var b = 6;
        System.out.println(a + b);
        // 9. Imprmir el tipo de dos variables creadas anteriormente
        // Para String (es un objeto), se puede llamar directo:
        System.out.println("Tipo de name: " + name.getClass().getSimpleName());
        // Para int (es primitivo), hay que convertirlo a Object primero:
        System.out.println("Tipo de age: " + ((Object) age).getClass().getSimpleName());
    }
}
