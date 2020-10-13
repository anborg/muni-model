package muni.service;

import muni.model.Model;

public interface SubsystemService {
    //TODO priority-1. return user/customer with id
    Model.Person save(Model.Person person);

    //TODO priority-2. return case/folder/whatever with id
    Model.Case save(Model.Case bizCase);

    //TODO Later
    Model.Person getPerson(String id);
    Model.Person findPerson(Model.Person person);
    Model.PostalAddress getPostalAddress(String id);
    Model.PostalAddress createPostalAddress(String id);
    Model.Case getCase(String id);
}
