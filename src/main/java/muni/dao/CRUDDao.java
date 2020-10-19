package muni.dao;

import java.util.List;
import java.util.Optional;

public interface CRUDDao<T> {
    Long save(T in); //CreateOrUpdate
    Long update(T in); //CreateOrUpdate

    Optional<T> getById(long id); //select - where active=true ()
    List<T> findBySample(T in);//dynamic select
    void setInactive(T in);// pass an object so, lifecycle of subobjects can be determined.

    //
    @Deprecated
//Marked deprecated - not for production
    List<T> getAll();

    @Deprecated
    void deleteAll();

    @Deprecated
    void delete(long id);

}
