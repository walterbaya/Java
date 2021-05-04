package javaservlets.holamundo;

import java.util.ArrayList;
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar usuario: ");
        var usuario = scanner.nextLine();
        System.out.println("Lo ingresado es: " + usuario);
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar clave secreta: ");
        var en = scanner.nextLine();
        ArrayList<Integer> v = new ArrayList();
        v.add(12);
        v.add(1);
        v.add(3);
        v.add(23);
        v.add(9);
        v.add(12);

        if (en.equals("jabon")) {
            v.forEach(e -> System.out.print(e + ", "));
        } else {
            System.out.println("No esta bien, perdiste tu oportunidad.");
        }

    }

}
