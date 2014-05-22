/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesDAOImpl;

import clasesDAOinterfaces.UsuarioDAO;
import entities.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

/**
 *
 * @author agustin
 */
public class UsuarioDAOimpl  implements UsuarioDAO {
    EntityManagerFactory EMF;
    
    @Override
    public Usuario create(Usuario entity) {
        EntityManager em = EMF.createEntityManager(); 
        EntityTransaction etx = em.getTransaction();
        
        etx.begin();
        em.persist(entity);
        em.flush();
        etx.commit();
        em.close();
        
        return entity;
    }

    @Override
    public Usuario update(Usuario entity) {
        //HACER CUANDO SEA NECESARIO
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Usuario entity) {
        EntityManager em = EMF.createEntityManager();
        
        em.getTransaction().begin();
        em.remove(entity);
        em.getTransaction().commit();
        
    }

    @Override
    public Usuario findById(Integer key) {
        
        EntityManager em = EMF.createEntityManager();
        Usuario result = em.find(Usuario.class, key);
        
        return result;
    }



    
}
