
public class HolaMundo {

    public static void main(String[] args) {

        var nombre = "Karla";
        var apellido = "Esparza";
        
        //El caracter \ se conoce como caracter de escape
        //gracias a el podemos decirle al compilador que
        //reconozca algunos caracteres que vienen luego del \
        //como ordenes, por ejemplo:

        //caracter espacio en blanco
        System.out.println(nombre + " " + apellido);
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b\b" + nombre);
        System.out.println("Retorno de carro: \r" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
        
        System.out.println("saludos");
        //El metodo print imprime sin generar un salto de linea.
        System.out.print("adios");
        System.out.println("nos vemos");


        //CLASE SCANNER

        //Sirve para evitar el HARDCODE
        //Trabajar con scanner es lo que hay que hacer en realidad.

        //creamos un scanner, le indicamos que queremos leer de la consola
        //usando System.in.
        //Importar la clase scanner 

        Scanner scanner = new Scanner(System.in);
        
        //imprime un mensaje antes de cargar el valor en var.

        System.out.println("proporciona el valor del usuario:");
        
        //usando scanner.nextLine leemos lo proporcionado por el usuario.
        
        var usuario = scanner.nextLine();
   
        System.out.println("usuario = " + usuario);
    }
}
