package Datos;

import Datos.AccesoDatos;

public class ImplementacionMySql implements AccesoDatos{
    
    //aunque diga override es opcional agregar el override hya que no hay sobreescritura quizas sea mejor no hacerlo.
 
    public void insertar() {
        System.out.println("Insertar desde MySql");
    }

    
    public void listar() {
        System.out.println("Listar desde MySql");
    }
    //cuando uno implementa se deben implementar todos los metodos
    //o si es abstracta no es necesario.
}
