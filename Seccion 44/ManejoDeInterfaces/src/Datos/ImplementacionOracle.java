
package Datos;

import Datos.AccesoDatos;

public class ImplementacionOracle implements AccesoDatos {

    //aunque diga override es opcional agregar el override hya que no hay sobreescritura quizas sea mejor no hacerlo.
 
    public void insertar() {
        System.out.println("Insertar desde Oracle");
    }

    
    public void listar() {
        System.out.println("Listar desde Oracle");
    }
    //cuando uno implementa se deben implementar todos los metodos
    //o si es abstracta no es necesario.
    
}
