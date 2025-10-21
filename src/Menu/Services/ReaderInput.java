package Menu.Services;

public class ReaderInput {
    private final java.util.Scanner scanner;

    public ReaderInput() {
        this.scanner = new java.util.Scanner(System.in);
    }

    public int readOption(int min, int max) {
        while (true) {
            try {
                System.out.print("\nSelecciona una opción (" + min + "-" + max + "): ");
                int option = scanner.nextInt();

                if (option >= min && option <= max) {
                    return option;
                } else {
                    System.out.println("❌ Opción inválida. Intenta de nuevo.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("❌ Por favor ingresa un número válido.");
                scanner.nextLine();
            }
        }
    }
}
