package muni.service;

import corp.model.Case;
import corp.model.Person;
import corp.model.PostalAddress;

import java.util.List;
import java.util.Optional;

public interface  SubsystemService {

    SubsystemDataAccess<Person> person() ;
    SubsystemDataAccess<Case> ccase() ;
    SubsystemDataAccess<PostalAddress> address() ;

    interface SubsystemDataAccess<T>{
        //TODO priority-1. return user/customer with id
        T create(T in);
        T update(T in);

        Optional<T> get(Long id);

        List<T> find(T in);
        List<T> recent();
    }
}
