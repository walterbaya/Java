/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.cliente.cascade;

import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.domain.Usuario;
import org.apache.logging.log4j.*;

/**
 *
 * @author Walter
 */
public class PersistenciaCascadaJPA {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        tx.begin(); 
        
        Persona persona1 = new Persona("Hugo", "Hernandez", "hhernandez@mail.com", "1132812848");
        
        Usuario usuario1 = new Usuario("Hern", "1234", persona1);
    
        em.persist(usuario1);
        
   
        tx.commit();
        
        log.debug("Persona: " + persona1);
        log.debug("Usuario: " + usuario1);
        
        em.close();
    
    }
}
