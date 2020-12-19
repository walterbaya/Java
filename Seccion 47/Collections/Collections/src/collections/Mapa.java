package collections;

import java.util.*;

public class Mapa {
    public static void main(String[] args) {
        //Tambien la interfaz set, al ser implementada por HashSet podemos pasarle Objects
        Map miMapa = new HashMap();
        //llave, valor
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Carlos");
        //elemento duplicado
        miMapa.put("valor3", "Rosario");
        
        //no se puede imprimir el mapa, solo las llaves o los valores asociados
        
        //Imprimo las llaves
        
        imprimir(miMapa.keySet());
        
        //Imprimo los valores
        
        imprimir(miMapa.values());
        
        //NOTAR QUE NO RESPETA EL ORDEN.
        //sustituye el valor si se duplica una llave.
        //Notar que no se agregan DUPLICADOS!
        //Mantiene el orden igual que list.
        
        System.out.println(miMapa.get("valor3"));
    }
        private static void imprimir(Collection coleccion){
        for (Object elemento: coleccion) {
            //iteramos todos los elementos dentro de la coleccion usando este for raro.
            System.out.println("elemento " + elemento);
        }
        System.out.println("");
    }
}
