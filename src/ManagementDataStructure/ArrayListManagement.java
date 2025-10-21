package ManagementDataStructure;

import Menu.Services.ReaderInput;

import java.util.ArrayList;
import java.util.List;

public class ArrayListManagement {
    private List<String> list;
    private ReaderInput reader;

    public ArrayListManagement(ReaderInput reader) {
        this.list = new ArrayList<>();
        this.reader = reader;
    }

    public void execute() {
        while (true) {
            displayMenu();
            int choice = reader.readOption(1,5);
            switch (choice) {
                case 1:
                    addElement();
                    break;
                case 2:
                    removeElement();
                    break;
                case 3:
                    moveElement();
                    break;
                case 4:
                    displayList();
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private void displayMenu() {
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║      MENÚ ARRAYLIST          ║");
        System.out.println("╠══════════════════════════════╣");
        System.out.println("║ 1. Agregar elemento          ║");
        System.out.println("║ 2. Eliminar elemento         ║");
        System.out.println("║ 3. Mover elemento            ║");
        System.out.println("║ 4. Mostrar lista             ║");
        System.out.println("║ 5. Volver al menú principal  ║");
        System.out.println("╚══════════════════════════════╝");
    }

    private void addElement() {
        System.out.print("Ingrese el elemento a agregar: ");
        String value = reader.readString();
        list.add(value);
        System.out.println("Elemento agregado: " + value);
        displayList();
    }

    private void removeElement() {
        if (list.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        System.out.print("Ingrese el índice del elemento a eliminar (0-" + (list.size() - 1) + "): ");
        int index = reader.readIntInRange(0, list.size() - 1);
        if (index >= 0) {
            String removed = list.remove(index);
            System.out.println("Elemento eliminado: " + removed);
            displayList();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    private void moveElement() {
        if (list.size() < 2) {
            System.out.println("La lista debe tener al menos 2 elementos para mover.");
            return;
        }
        System.out.print("Ingrese el índice del elemento a mover (0-" + (list.size() - 1) + "): ");
        int fromIndex = reader.readIntInRange(0, list.size() - 1);
        if (fromIndex >= 0) {
            System.out.print("Ingrese el índice destino (0-" + (list.size() - 1) + "): ");
            int toIndex = reader.readIntInRange(0, list.size() - 1);
            if (toIndex >= 0 && fromIndex != toIndex) {
                String moved = list.remove(fromIndex);
                list.add(toIndex, moved);
                System.out.println("Elemento movido de índice " + fromIndex + " a " + toIndex);
                displayList();
            } else {
                System.out.println("Índice destino inválido o igual al origen.");
            }
        } else {
            System.out.println("Índice origen inválido.");
        }
    }

    private void displayList() {
        if (list.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        System.out.println("Lista actual:");
        System.out.println("┌─────┬──────────┐");
        System.out.println("│ Ídx │ Elemento │");
        System.out.println("├─────┼──────────┤");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("│ %-3d │ %-8s │%n", i, list.get(i));
        }
        System.out.println("└─────┴──────────┘");
    }
}