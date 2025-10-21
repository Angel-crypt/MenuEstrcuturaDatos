package ManagementDataStructure;

import Menu.Services.ReaderInput;

import java.util.HashSet;

public class HashSetManagement {
    private HashSet<String> hashSet;
    private ReaderInput reader;

    public HashSetManagement(ReaderInput reader) {
        this.hashSet = new HashSet<>();
        this.reader = reader;
    }

    public void execute(){
        while (true) {
            displayMenu();
            int choice = reader.readOption(1, 5);
            switch (choice){
                case 1:
                    addElement();
                    break;
                case 2:
                    removeElement();
                    break;
                case 3:
                    searchElement();
                    break;
                case 4:
                    displayHashSet();
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private void displayMenu(){
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║        MENÚ HASHSET          ║");
        System.out.println("╠══════════════════════════════╣");
        System.out.println("║ 1. Agregar elemento          ║");
        System.out.println("║ 2. Eliminar elemento         ║");
        System.out.println("║ 3. Buscar elemento           ║");
        System.out.println("║ 4. Mostrar HashSet           ║");
        System.out.println("║ 5. Volver al menú principal  ║");
        System.out.println("╚══════════════════════════════╝");
    }

    private void addElement(){
        System.out.print("Ingrese el elemento a agregar: ");
        String element = reader.readString();

        if (hashSet.add(element)) {
            System.out.println("Elemento agregado: " + element);
        } else {
            System.out.println("El elemento ya existe en el HashSet (no se permiten duplicados).");
        }
        displayHashSet();
    }

    private void removeElement() {
        if (hashSet.isEmpty()) {
            System.out.println("El HashSet está vacío.");
            return;
        }
        displayHashSet();
        System.out.print("Ingrese el elemento a eliminar: ");
        String element = reader.readString();

        System.out.print("Confirme el elemento a eliminar: ");
        String confirmation = reader.readString();

        if (!element.equals(confirmation)) {
            System.out.println("Error: La confirmación no coincide.");
            System.out.println("  Elemento ingresado: " + element);
            System.out.println("  Confirmación: " + confirmation);
            return;
        }

        if (hashSet.remove(element)) {
            System.out.println("Elemento eliminado exitosamente: " + element);
            displayHashSet();
        } else {
            System.out.println("Elemento no encontrado en el HashSet.");
        }
    }

    private void searchElement() {
        if (hashSet.isEmpty()) {
            System.out.println("El HashSet está vacío.");
            return;
        }
        System.out.print("Ingrese el elemento a buscar: ");
        String element = reader.readString();

        if (hashSet.contains(element)) {
            System.out.println("El elemento '" + element + "' SÍ existe en el HashSet.");
        } else {
            System.out.println("El elemento '" + element + "' NO existe en el HashSet.");
        }
    }

    private void displayHashSet() {
        if (hashSet.isEmpty()) {
            System.out.println("El HashSet está vacío.");
            return;
        }
        System.out.println("\nHashSet actual:");
        System.out.println("┌─────┬─────────────────────────┐");
        System.out.println("│  #  │        Elemento         │");
        System.out.println("├─────┼─────────────────────────┤");

        int index = 1;
        for (String element : hashSet) {
            System.out.printf("│ %-3d │ %-23s │%n", index++, element);
        }

        System.out.println("└─────┴─────────────────────────┘");
        System.out.println("Total de elementos: " + hashSet.size());
    }
}