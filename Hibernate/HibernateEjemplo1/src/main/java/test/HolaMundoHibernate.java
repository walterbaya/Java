
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.*;
import entidades.*;


public class HolaMundoHibernate {
    public static void main(String[] args) {
        //HQL es el Hibernate query Language 
        //es como el lenguaje sql similar, pero usando las CLASES DE ENTIDAD en vez
        //de los nombres de la tabla
        
        String hql = "SELECT p FROM Persona p";
        
        //Creo una fabrica de manejadores de entidades
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("HibernateEjemplo1");
        //creo un manejador de entidades
        EntityManager entityManager = fabrica.createEntityManager();
        
        //al manejador puedo pasarle un query
        
        Query query = entityManager.createQuery(hql);
 
        //Execute a SELECT query and return the query results as an untyped List.
        //Es decir el getResultList es quien ejecuta el SELECT de nombre query
        
        List<Persona> personas = query.getResultList();
        for (Persona p: personas) {
            System.out.println("Persona: " + p.getApellido() + p.getNombre() + p.getCodigo());
        }
    }
}
