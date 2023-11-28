package mx.com.gm.sga.cliente.asociaciones;

import java.util.List;
import javax.persistence.*;
import mx.com.gm.sga.domain.*;
import org.apache.logging.log4j.*;


public class ClienteAsociacionesJPA {
    static Logger log = LogManager.getRootLogger();
    
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        List<Persona> personas = em.createNamedQuery("Persona.findAll").getResultList();
        
        em.close();
        
        for (Persona persona: personas) {
            log.debug("Persona: " + persona);
            //Recuperamos los usuarios de cada persona
            
            for(Usuario usuario: persona.getUsuarioList()){
                log.debug("Usuario: " + usuario);
            }
        }
        
    }
}
