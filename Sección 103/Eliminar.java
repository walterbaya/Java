Public class Eliminar{

    @Test
    public void testEliminarObjeto() {
    
        //Paso 1. Crea nuevo objeto
        //El objeto esta en estado transitivo
    
        EntityTransaction tx = em.getTransaction();
        tx.begin();
 
        //Paso 2. Iniciamos la transacción, buscamos el que queremos borrar
    
        Persona persona1 = em.find(Persona.class, 23);

        //Paso 3. Terminamos con la transaccion 1 

        tx.commit();

        //Paso 4. Iniciamos la segunda transacción, para borrar el objeto

        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();

        //Paso 5. La borramos.

        em.remove(persona1);

        //Paso 6. Finalizamos

        tx2.commit();
    
}   



@Test
    public void testEliminarObjetoLarga() {
    
        //Paso 1. Crea nuevo objeto
        //El objeto esta en estado transitivo
    
        EntityTransaction tx = em.getTransaction();
        tx.begin();
 
        //Paso 2. Iniciamos la transacción, buscamos el que queremos borrar
    
        Persona persona1 = em.find(Persona.class, 23);

        //Paso 3. La borramos.

        em.remove(persona1);

        //Paso 4. Finalizamos

        tx2.commit();
    
}   



}

