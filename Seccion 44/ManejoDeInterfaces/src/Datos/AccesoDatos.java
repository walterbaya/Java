package Datos;

public interface AccesoDatos {

    //en automatico el compilador le agrega public static ya que por ser interfaz es constante
    int MAX_REGISTROS = 10;
    //por eso va en mayuscula
    
    //a los metodos tambien en automatico se le agregan public y abstract asi que no es necesario.
    
    public abstract void insertar();
    
    void listar(); 

}
