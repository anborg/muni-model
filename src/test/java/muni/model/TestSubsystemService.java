package muni.model;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class TestSubsystemService {

    @Test
    public void test_SubsystemService_usage(){
        final var service = new TestSubsystemDummy();
        Optional<Model.Person> perso = service.person().get("1");
        Model.Person savedP = service.person().create(Model.Person.getDefaultInstance());
        List<Model.Person> foundP = service.person().find(Model.Person.getDefaultInstance());
        //address
        Optional<Model.PostalAddress> addr = service.address().get("1");

        //class
        Optional<Model.Case> ccase = service.ccase().get("1");

    }
}
