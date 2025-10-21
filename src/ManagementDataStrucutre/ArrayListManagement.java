package ManagementDataStrucutre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListManagement {

    public ArrayListManagement() {
        List<String> lista = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Introduce el numero que desea agregar o oprime c para salir: ");
            String valor = input.next();

            if (valor.equalsIgnoreCase("c")){
                break;
            }

            lista.add(input.next());
        }

        System.out.println("Lista actual: "+ lista);

        System.out.println("Posicion a mover el numero: ");
        int posicion = input.nextInt();

        if (lista.size() > 1 && posicion < lista.size()) {
            String mover = lista.remove(0);
            lista.add(posicion, mover);
        } else {
            System.out.println("No existe el numero que desea agregar");
        }

        System.out.println("lista modificada: " + lista);

        input.close();


    }
}
