
package collections;

//Importamos todo de la clase util
import java.util.*;

public class Lista {


    public static void main(String[] args) {
        

        //Definimos una variable de tipo Lista que es una interface 
        //Como de una interfaz no se puede crear un objeto, necesitamos una clase
        //que implemente dicha interfaz,en este caso ArrayList implementa List.
        //Agrega de manera ordenada a elementos.
        List miLista = new ArrayList(); 
        miLista.add("1");
        miLista.add(2);
        miLista.add(3);
        //Agregamos elemento repetido
        miLista.add(3);
        imprimir(miLista);
        
        //PODEMOS AGREGAR TIPOS DE CUALQUIER COSA, YA QUE LA COLECCION ALMACENA ELEMENTOS DE TIPO 
        //OBJECT EN GENERAL.
        
    }
    //usamos el tipo generico coleccion que es la interface superior a todas en el arbol
    //y es aquella implementada por todas las clases de tipo coleccion.
    
    private static void imprimir(Collection coleccion){
        for (Object elemento: coleccion) {
            //iteramos todos los elementos dentro de la coleccion usando este for raro.
            System.out.println("elemento " + elemento);
        }
        System.out.println("");
    }
}
