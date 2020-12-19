
package manejodeinterfaces;

import Datos.AccesoDatos;
import Datos.ImplementacionMySql;
import Datos.ImplementacionOracle;


public class ManejoDeInterfaces {

    public static void main(String[] args) {
        //Variable datos de tipo AccesoDatos apunta a el objeto ImplementacionOracle
        AccesoDatos datos = new ImplementacionOracle();
        datos.insertar();
        datos.listar();
        AccesoDatos datos2 = new ImplementacionMySql();
        datos2.insertar();
        datos2.listar();
        System.out.println(AccesoDatos.MAX_REGISTROS);
    }
    
}
