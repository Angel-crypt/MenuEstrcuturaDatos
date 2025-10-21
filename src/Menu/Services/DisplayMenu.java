package Menu.Services;

import Menu.MenuOption;

public class DisplayMenu {
    public void show(java.util.List<MenuOption> options) {
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║      MENÚ PRINCIPAL            ║");
        System.out.println("╠════════════════════════════════╣");

        for (int i = 0; i < options.size(); i++) {
            System.out.printf("║ %d. %-28s║%n", (i + 1), options.get(i).obtainDescription());
        }

        System.out.println("╚════════════════════════════════╝");
    }
}
