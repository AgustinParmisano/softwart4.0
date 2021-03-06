/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesDAOinterfaces;

/**
 *
 * @author agustin
 */
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractBaseGenericDAOImpl<T, K extends Serializable> implements BaseGenericDAO<T, K> {

    @PersistenceContext
    protected EntityManager em;

    protected Class<T> classType;

    public AbstractBaseGenericDAOImpl() {
        super();
        this.classType = (Class<T>)getParameterClass(getClass(), 0);
    }

    @Override
    public T create(T entity) {
        this.em.persist(entity);
        return entity;
    }

    @Override
    public T update(T entity) {
        return this.em.merge(entity);
    }

    @Override
    public void delete(T entity) {
        this.em.remove(entity);
    }

    @Override
    public T findById(K key) {
        return this.em.find(classType, key);
    }

    private static Class<?> getParameterClass(Class<?> clazz, int index) {
        return (Class<?>)(((ParameterizedType)clazz.getGenericSuperclass()).getActualTypeArguments()[index]);
    }
}
