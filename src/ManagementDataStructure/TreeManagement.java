package ManagementDataStructure;

import ManagementDataStructure.extras.Node;

import java.util.LinkedList;
import java.util.Queue;

public class TreeManagement {
    private Node root;

    public void buildTree(int size) {
        if (size < 1) {
            System.out.println("El tamaño debe ser mayor a 0.");
            return;
        }

        root = new Node(1);

        if (size == 1) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int currentValue = 2;

        while (!queue.isEmpty() && currentValue <= size) {
            Node current = queue.poll();

            if (currentValue <= size) {
                current.setLeft(new Node(currentValue));
                queue.add(current.getLeft());
                currentValue++;
            }

            if (currentValue <= size) {
                current.setRight(new Node(currentValue));
                queue.add(current.getRight());
                currentValue++;
            }
        }
    }

    public void showByLevels() {
        if (root == null) {
            System.out.println("Árbol vacío");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        System.out.println("\nÁrbol por niveles:");
        int level = 0;

        while (!queue.isEmpty()) {
            int nodesInLevel = queue.size();
            System.out.print("Nivel " + level + ": ");

            for (int i = 0; i < nodesInLevel; i++) {
                Node current = queue.poll();
                System.out.print(current.getValue() + " ");

                if (current.getLeft() != null) {
                    queue.add(current.getLeft());
                }
                if (current.getRight() != null) {
                    queue.add(current.getRight());
                }
            }
            System.out.println();
            level++;
        }
    }

    public Node getRoot() {
        return root;
    }
}