/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.cliente.ciclovidajpa;

import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.*;

/**
 *
 * @author Walter
 */
public class EliminarObjeto {
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
        //Paso 3. No termino la transaccion, sino que elimino el objeto
        
        //Estp lo hacemos para tener la ultima version de la persona, directamente se podria hacer el find y remove.
        em.remove(em.merge(persona1));
        
        //Paso 4. Finalizo la transaccion
        
        tx.commit();
       
        //Cerramos el entity manager
        em.close();

    }
}
