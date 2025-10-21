package Menu.Services;

public class ReaderInput {
    private final java.util.Scanner scanner;

    public ReaderInput() {
        this.scanner = new java.util.Scanner(System.in);
    }

    public int readOption(int minOptions, int maxOptions) {
        while (true) {
            try {
                System.out.print("\nSelecciona una opción (" + minOptions + "-" + maxOptions + "): ");
                int option = scanner.nextInt();
                if (option < 1 || option > maxOptions) {
                    System.out.println("Opción inválida. Intente de nuevo (1-" + maxOptions + "): ");
                    continue;
                }
                scanner.nextLine(); // Clear buffer
                return option;
            } catch (Exception e) {
                System.out.println("Entrada inválida. Ingrese un número (1-" + maxOptions + "): ");
                scanner.nextLine(); // Clear buffer
            }
        }
    }

    public String readString() {
        return scanner.nextLine().trim();
    }

    public int readIntInRange(int min, int max) {
        while (true) {
            try {
                int value = scanner.nextInt();
                if (value >= min && value <= max) {
                    scanner.nextLine(); // Clear buffer
                    return value;
                }
                System.out.println("Índice inválido. Ingrese un número entre " + min + " y " + max + ": ");
            } catch (Exception e) {
                System.out.println("Entrada inválida. Ingrese un número entre " + min + " y " + max + ": ");
                scanner.nextLine(); // Clear buffer
            }
        }
    }
}
