package data_structure;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) {
        // ====================================================== 
        // 4. MAPS (Mapas o Diccionarios) 
        // ====================================================== 
        // - Almacenan pares de Clave -> Valor (Key -> Value). 
        // - Las CLAVES deben ser ÚNICAS. Si se inserta una clave existente, el valor se SOBREESCRIBE. 
        // - Muy eficientes para buscar un valor a partir de su clave. 
        // - La interfaz principal es `Map`. 

        System.out.println("--- 4. MAPS: Implementaciones ---");

        // A) HashMap:
        // - El más rápido. 
        // - NO garantiza ningún orden. 
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Juan", 25);
        hashMap.put("Ana", 30);
        hashMap.put("Luis", 22);
        System.out.println("HashMap (sin orden): " + hashMap);

        for(Map.Entry<String, Integer> owo : hashMap.entrySet()) {
            System.out.println(owo);
        }
        // B) LinkedHashMap:
        // - Mantiene el ORDEN DE INSERCIÓN. 
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Juan", 25);
        linkedHashMap.put("Ana", 30);
        linkedHashMap.put("Luis", 22);
        System.out.println("LinkedHashMap (orden de inserción): " + linkedHashMap);

        // C) TreeMap:
        // - Mantiene las claves ORDENADAS NATURALMENTE. 
        // - El más lento, pero útil si necesitas las claves siempre ordenadas. 
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Juan", 25);
        treeMap.put("Ana", 30);
        treeMap.put("Luis", 22);
        System.out.println("TreeMap (orden por clave): " + treeMap);
        System.out.println();


        // ====================================================== 
        // D) Operaciones Comunes 
        // ====================================================== 
        System.out.println("--- Operaciones Comunes con HashMap ---");
        Map<String, String> capitales = new HashMap<>();

        // D.1) Insertar (`put`) y Sobrescribir 
        capitales.put("España", "Madrid");
        capitales.put("Francia", "París");
        capitales.put("Japón", "Tokio");
        System.out.println("Capitales iniciales: " + capitales);
        
        capitales.put("Japón", "Tokyo"); // Sobrescribe el valor para la clave "Japón" 
        System.out.println("Después de corregir 'Tokio': " + capitales);

        // D.2) Obtener (`get`) 
        String capitalDeFrancia = capitales.get("Francia");
        System.out.println("La capital de Francia es: " + capitalDeFrancia);

        // D.3) `getOrDefault`: Obtener un valor de forma segura 
        // Si la clave no existe, devuelve un valor por defecto en lugar de `null`. 
        String capitalDeItalia = capitales.getOrDefault("Italia", "No encontrada");
        System.out.println("La capital de Italia es: " + capitalDeItalia);

        // D.4) Eliminar (`remove`) 
        capitales.remove("España");
        System.out.println("Después de eliminar España: " + capitales);

        // D.5) Consultas (`contains...`) 
        System.out.println("¿El mapa contiene la clave 'Francia'? " + capitales.containsKey("Francia"));
        System.out.println("¿El mapa contiene el valor 'París'? " + capitales.containsValue("París"));
        System.out.println("Tamaño del mapa: " + capitales.size());
        System.out.println();


        // ====================================================== 
        // E) Formas de Iterar un Mapa 
        // ====================================================== 
        System.out.println("--- Formas de Iterar un Mapa ---");
        
        // E.1) Iterar solo sobre las claves (`keySet`) 
        System.out.println("Iterando sobre claves (keySet):");
        for (String pais : capitales.keySet()) {
            System.out.println("- Clave: " + pais);
        }

        // E.2) Iterar solo sobre los valores (`values`) 
        System.out.println("\nIterando sobre valores (values):");
        for (String capital : capitales.values()) {
            System.out.println("- Valor: " + capital);
        }

        // E.3) Iterar sobre el par Clave-Valor (`entrySet`) - ¡La forma más eficiente! 
        System.out.println("\nIterando sobre entradas (entrySet):");
        for (Map.Entry<String, String> entrada : capitales.entrySet()) {
            System.out.println("- " + entrada.getKey() + " -> " + entrada.getValue());
        }

        // Limpiar el mapa 
        capitales.clear();
        System.out.println("\nMapa después de clear(): " + capitales);
        System.out.println("¿Está vacío ahora? " + capitales.isEmpty());
    }
}
