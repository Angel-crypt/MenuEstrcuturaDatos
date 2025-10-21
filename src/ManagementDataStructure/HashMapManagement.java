package ManagementDataStructure;

import Menu.Services.ReaderInput;

import java.util.HashMap;
import java.util.Map;

public class HashMapManagement {
    private HashMap<String, String> hashMap;
    private ReaderInput reader;

    public HashMapManagement(ReaderInput reader) {
        this.hashMap = new HashMap<>();
        this.reader = reader;
    }

    public void execute(){
        while (true) {
            displayMenu();
            int choice = reader.readOption(1,4);
            switch (choice){
                case 1:
                    addElement();
                    break;
                case 2:
                    removeElement();
                    break;
                case 3:
                    displayHashMap();
                    break;
                case 4:
                    System.out.println("Volviendo al menú principal...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private void displayMenu(){
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║        MENÚ HASHMAP          ║");
        System.out.println("╠══════════════════════════════╣");
        System.out.println("║ 1. Agregar elemento          ║");
        System.out.println("║ 2. Eliminar elemento         ║");
        System.out.println("║ 3. Mostrar HashMap           ║");
        System.out.println("║ 4. Volver al menú principal  ║");
        System.out.println("╚══════════════════════════════╝");
    }

    private void addElement(){
        System.out.print("Ingrese la clave a agregar: ");
        String key = reader.readString();
        System.out.print("Ingrese el valor para esta clave: ");
        String value = reader.readString();
        hashMap.put(key, value);
        System.out.println("Elemento agregado: <" + key + ", " + value + ">");
        displayHashMap();
    }

    private void removeElement() {
        if (hashMap.isEmpty()) {
            System.out.println("El HashMap está vacío.");
            return;
        }
        displayHashMap();
        System.out.print("Ingrese la clave del elemento a eliminar: ");
        String key = reader.readString();

        if (!hashMap.containsKey(key)) {
            System.out.println("Clave no encontrada.");
            return;
        }

        System.out.print("Ingrese el valor asociado a esta clave: ");
        String value = reader.readString();

        if (hashMap.get(key).equals(value)) {
            hashMap.remove(key);
            System.out.println("Elemento eliminado exitosamente: <" + key + ", " + value + ">");
            displayHashMap();
        } else {
            System.out.println("Error: El valor ingresado no coincide con el valor almacenado.");
            System.out.println("Valor esperado: " + hashMap.get(key));
            System.out.println("Valor ingresado: " + value);
        }
    }

    private void displayHashMap() {
        if (hashMap.isEmpty()) {
            System.out.println("El HashMap está vacío.");
            return;
        }
        System.out.println("\nHashMap actual:");
        System.out.println("┌─────────────────┬─────────────────┐");
        System.out.println("│      Clave      │      Valor      │");
        System.out.println("├─────────────────┼─────────────────┤");

        // Iterar sobre las entradas del HashMap
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("│ %-15s │ %-15s │%n", key, value);
        }

        System.out.println("└─────────────────┴─────────────────┘");
        System.out.println("Total de elementos: " + hashMap.size());
    }
}