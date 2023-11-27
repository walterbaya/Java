
package mx.com.gm.sga.cliente.ciclovidajpa;

import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.*;

/**
 *
 * @author Walter
 */
public class ModificarObjetoJPA {
     static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        //Inicia la transaccion
        //Paso 1. 
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //Paso 2. Ejecutar SQL de tipo select para obtener el objeto
        Persona persona1 = em.find(Persona.class, 1);

        log.debug("Estos eran los datos de la persona: " + persona1);
        //Paso 3. No termino la transaccion, sino que modifico directamente el objeto

        persona1.setApellido("William");
        persona1.setNombre("Enrique");
        persona1.setEmail("waleo@yahoo.com");
        
        //Paso 4. ahora hacemos merge para modificarlo en la base de datos
        
        //inclusive no es necesario usar el metodo merge, al hacer la transaccion, el commit y finalizar se guardan automaticamente.
        //em.merge(persona1);
        
        //Paso 5. Finalizo la transaccion
        
        tx.commit();
        
        log.debug("Obtenemos el objeto de tipo persona con los datos modificados: " + persona1);

       
        //Cerramos el entity manager
        em.close();

    }
}
