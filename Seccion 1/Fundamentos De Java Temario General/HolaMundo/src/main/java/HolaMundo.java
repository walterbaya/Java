public class HolaMundo {
   
    public static void main(String args[]){
         //Para crear el metodo main de forma automatica se puede 
         //escribir psvm y presionar tab.
         //para  indentar recordar usar tab dado que ayuda a mantener la
         //indentacion correctamente 
         //de todas maneras si algo queda mal se puede hacer boton derecho ->format y listo.
         System.out.println("Hola Mundo!");
	
	 String saludar = "saludos";
 	
	 //utilizamos la variable para imprimir el contenido 
	 //de la variable saludar

  	 System.out.println(saludos);
	 System.out.println(saludos);
	 System.out.println(saludos);
	
	 //cada vez que modifiquemos la variable saludar se
	 //se replicaran los cambios
	
	 //en nuevas versiones de java se esta usando la palabra
	 //var al igual que en javascript, la variable inferira
	 //que tipo va a tener var, sin tener que especificarlo
	 //a partir de la version 10 se empezo a utilizar asi.
	 //Si tenemos la version JDK 10+	
	
	 var despedirse = "hasta luego";
	
   	 System.out.println(despedirse);

	 //CONCATENACION
	
      	 var usuario = "Juan";
	 var saludar = "Hola";
	
 	 //se unen los valores al utilizar el símbolo +
	
	 System.out.println(saludar + usuario);
	
	 //La suma es el unico operador sobrecargado

	 var i = 3;
	 var j = 5;

	 //esto devolvera el resultado de una suma.
	 System.out.println(i + j);
	
	 

	 //Como hay una cadena no suma nada, sino que concatena.
	 System.out.println(saludar + i + j);

	

 	  //realiza la suma y luego concatena el resultado con la cadena.
	  System.out.println(i + j + saludar);

	
	 //REGLAS PARA DEFINIR UNA VARIABLE EN JAVA.
	
	 //El identificador se inicia en minuscula en general
	 //la mayuscula se utiliza para definir TIPOS DE DATOS
	 //si se utilizan varias palabras se debe usar camello.
	 //se puede utilizar guion bajo signo dolar.
         //si usamos var es necesario SI O SI asignarle un valor.
	 //sino hay que usar directamente el tipo especificamente.
	 //no se pueden usar tipos especiales como comilla, ni empezar con numeros
	 //pero si se pueden usar numeros en el medio del identificador
	 //tampoco esta permitido utilizar las palabras reservadas en java
	 //como identificador.
	 var saludoCamello = "Hola mundo"; 


	 //ME QUEDE EN EL MINUTO 1

	 var nombre = "Karla";
	 var apellido = "Esparza";
	 System.out.println(nombre + " " + apellido);
	
    }
}
