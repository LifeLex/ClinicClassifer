package es.alejandro.modelo;
import es.alejandro.modelo.Usuarios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class PersistenciaUsuarios {
    EntityManagerFactory emf = null;
    EntityManager em= null;
    EntityTransaction tx= null;

    public void save(Usuarios usuarios){
        try{
            emf = Persistence.createEntityManagerFactory("aplicacion");
            em = emf.createEntityManager();
            tx = em.getTransaction();
            tx.begin();

            em.persist(usuarios);

            tx.commit();
        }catch(Exception e){
            tx.rollback();
        }finally{
            em.close();
            emf.close();
        }

    }

    public void remove(Usuarios usuarios) {
        try{
            emf = Persistence.createEntityManagerFactory("p-peluqueria");
            em = emf.createEntityManager();
            tx = em.getTransaction();
            tx.begin();

            Usuarios borrar = em.find(Usuarios.class, usuarios.getDni());
            em.remove(borrar);

            tx.commit();
        }catch(Exception e){
            tx.rollback();
        }finally{
            em.close();
            emf.close();
        }
    }

    public void update(Usuarios usuarios) {
        try{
            emf = Persistence.createEntityManagerFactory("aplicacion");
            em = emf.createEntityManager();
            tx = em.getTransaction();
            tx.begin();

            Usuarios actualizar = em.find(Usuarios.class, usuarios.getDni());

            actualizar.setNombre(usuarios.getNombre());
            actualizar.setPassword(usuarios.getPassword());
            actualizar.setApellido(usuarios.getApellido());
            actualizar.setCreate_time(usuarios.getCreate_time());
            actualizar.setEmail(usuarios.getEmail());
            actualizar.setDireccion(usuarios.getDireccion());
            actualizar.setUsername(usuarios.getUsername());
            actualizar.setTelefono(usuarios.getTelefono());
            actualizar.setDni(usuarios.getDni());
            actualizar.setIdUsuario(usuarios.getIdUsuarios());

            tx.commit();
        }catch(Exception e){
            tx.rollback();
        }finally{
            em.close();
            emf.close();
        }
    }

    public List<Usuarios> recuperar() {

        emf = Persistence.createEntityManagerFactory("aplicacion");
        em = emf.createEntityManager();
        List<Usuarios> listaUsuarios = (List<Usuarios>) em.createQuery("FROM Usuarios").getResultList();
        return listaUsuarios;
    }
}
