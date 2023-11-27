Public class Persistir{

    @Test
    public void testPersistirObjeto() {
    
        //Paso 1. Crea nuevo objeto
        //El objeto esta en estado transitivo
    
        Persona persona1 = new Persona("Jorgito");

        //Paso 2. Iniciamos la transacción
    
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //Paso 3. Ejecutar SQL 

        em.persist(persona1);

        //Paso 4. Hacemos commit/rollback y Aca me persiste el objeto persona1 en la base

        tx.commit();

        //Finalmente el objeto quedo en estado detached

    
}   


}

