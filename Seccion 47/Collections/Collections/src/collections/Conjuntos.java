package collections;

import java.util.*;
public class Conjuntos {
    public static void main(String[] args) {
        //Tambien la interfaz set, al ser implementada por HashSet podemos pasarle Objects
        Set miSet = new HashSet();
        
        miSet.add(100);
        miSet.add(200);
        miSet.add(300);
        //Duplicado
        miSet.add(300);
        imprimir(miSet);
        //Notar que no se agregan DUPLICADOS!
        //Mantiene el orden igual que list.
    }
        private static void imprimir(Collection coleccion){
        for (Object elemento: coleccion) {
            //iteramos todos los elementos dentro de la coleccion usando este for raro.
            System.out.println("elemento " + elemento);
        }
        System.out.println("");
    }
}
