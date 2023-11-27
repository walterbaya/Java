Public class Modificar{

    //No es necesario iniciar la transaccion ni el commit, eso se hace en automatico en el servidor ejb
    //Si es una clase lo podemos hacer asi.

    @Test
    public void testModificarObjeto() {
    

        //Paso 1. Inicia transacción

        EntityTransaction tx = em.getTransaction();
        tx.begin();
 
        //Paso 2. Ejecutar SQL de tipo select con el metodo find

        Persona persona1 = em.find(Persona.class, 23);

        //Paso 3. Termina la transacción.

        tx.commit();
    
        //Paso 4. Modificamos un valor al objeto

        persona1.setEdad(35);

        //Paso 5. Inicia transacción para guardar esta vez

        EntityTransaction txg = em.getTransaction();
        txg.begin();
 
        //Paso 6. No usamos persist porque sino nos guarda uno nuevo, lo que hacemos es
        //usar merge para pisarlo.

        em.merge(persona1);

        //Paso 7. Termina la transacción.

        tx.commit();


    }   


    //Podemos actualizar usando una session larga, no cerrar la transacion
    //recuperar y modificar el objeto dentro de la misma transaccion.

    @Test
    public void testModificarObjetoLarga() {
    

        //Paso 1. Inicia transacción

        EntityTransaction tx = em.getTransaction();
        tx.begin();
 
        //Paso 2. Ejecutar SQL de tipo select con el metodo find

        Persona persona1 = em.find(Persona.class, 23);

        //Paso 3. Modificamos un valor al objeto

        persona1.setEdad(35);

        //Paso 4. Termina la transacción.

        tx.commit();


    }   





}

