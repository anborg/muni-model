package muni.dao;

import java.util.List;
import java.util.Optional;

public interface CRUDDao<T> {
    Optional<T> get(long id);

    Long save(T in); //CreateOrUpdate may internally calls get(id)

    //
    @Deprecated
    //Marked deprecated - not for production
    List<T> getAll();

    @Deprecated
    void deleteAll();

    @Deprecated
    void delete(long id);

}
