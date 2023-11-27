Public class Recuperar{

    @Test
    public void testPersistirObjeto() {
    
        //Paso 1. Inicia transacción

        EntityTransaction tx = em.getTransaction();
        tx.begin();
 
        //Paso 2. Ejecutar SQL de tipo select con el metodo find

        Persona persona1 = em.find(Persona.class, 23);

        //Paso 3. Termina la transacción, pasamos el objeto a estado detached 

        tx.commit();
    
        //Esto es para que el objeto ya no este relacionado con la base y pase a ser
        //un objeto propiamente

}   


}

