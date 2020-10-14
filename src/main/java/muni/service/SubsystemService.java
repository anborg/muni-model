package muni.service;

import muni.model.Model;

import java.util.List;
import java.util.Optional;

public interface SubsystemService {
    //TODO priority-1. return user/customer with id
    Model.Person save(Model.Person in);

    Optional<Model.Person> getPerson(String id);

    List<Model.Person> findPerson(Model.Person in);


    //TODO Case priority-2. return case/folder/whatever with id
    Model.Case save(Model.Case in);

    Optional<Model.Case> getCase(String id);

    List<Model.Case> findCase(Model.Case in);

    //TODO Later
    //Postal Address
    Optional<Model.PostalAddress> getPostalAddress(String id);

    Model.PostalAddress createPostalAddress(String id);

}
