package es.alejandro.tests;

import es.alejandro.modelo.Usuarios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.util.List;

public class TestsUsuarios {
    @PersistenceContext(unitName = "aplicacion")
    private static EntityManager manager;
    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        /*crear el gestor de persistencia
         */
        emf = Persistence.createEntityManagerFactory("aplicacion");
        manager= emf.createEntityManager();


        List<Usuarios> usuarios = (List<Usuarios>) manager.createQuery("FROM Usuarios").getResultList();
        System.out.println("En esta base de datos hay"+usuarios.size()+"usuarios");

    }
}
