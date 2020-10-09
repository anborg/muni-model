package mkm.service;

import muni.model.Model;

public interface SubsystemService {
    //TODO priority-1. return user/customer with id
    Model.Person createPerson(Model.Person person);
    //TODO priority-2. return case/folder/whatever with id
    Model.Case createCase(Model.Case bizCase);
    //TODO Later
    Model.Person getPerson(String id);
    Model.Person updatePerson(Model.Person person);
    Model.Person findPerson(Model.Person person);
    Model.PostalAddress getPostalAddress(String id);
    Model.PostalAddress createPostalAddress(String id);
    Model.PostalAddress updatePostalAddress(String id);
    Model.Case getCase(String id);
}
