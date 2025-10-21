package ManagementDataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueManagement {
    public QueueManagement() {
        Queue<String> queue = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Introduce el numero que desea agregar o oprime c para salir: ");
            String valor = input.next();

            if (valor.equalsIgnoreCase("c")){
                break;
            }

            queue.add(input.next());
        }

        System.out.println("Lista actual: "+ queue);

        System.out.println("Primero en la lista: "+ queue.peek());

        System.out.println("Elemento en eliminar: "+ queue.poll());

        System.out.println("Lista Actualizada: "+ queue);
    }
}
