package sehs.SERVICES;

import java.util.List;

/**
 *
 * @author Alumno
 */
public interface ICrudDao<T> {

    // definir los contratos (metodos)
    void create(T t) throws Exception;

    void update(T t) throws Exception;

    void delete(T t) throws Exception;

    T findForId(T t) throws Exception;

    List<T> readAll() throws Exception;
}
