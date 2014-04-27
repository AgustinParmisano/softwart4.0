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

public interface BaseGenericDAO<T, K> extends Serializable {

    T create(T entity);

    T update(T entity);

    void delete(T entity);

    T findById(K key);
}
