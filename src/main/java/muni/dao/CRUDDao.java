package muni.dao;

import java.util.List;

public interface CRUDDao<T> {
    T get(long id);

    long save(T in); //may internally calls get(id)

    //
    @Deprecated
    //Marked deprecated - not for production
    List<T> getAll();

    @Deprecated
    void deleteAll();

    @Deprecated
    void delete(long id);

    @Deprecated
    void createTable();
}
