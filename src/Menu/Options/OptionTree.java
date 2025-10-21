package Menu.Options;

import ManagementDataStructure.TreeManagement;
import Menu.BaseMenuOption;

import java.util.Scanner;

public class OptionTree extends BaseMenuOption {
    public OptionTree() {
        super("Manejo de Árbol Secuencial");
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        TreeManagement tree = new TreeManagement();

        System.out.print("Ingrese el tamaño del árbol: ");
        int size = scanner.nextInt();

        tree.buildTree(size);
        tree.showByLevels();
    }
}
