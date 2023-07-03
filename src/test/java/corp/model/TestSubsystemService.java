package corp.model;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class TestSubsystemService {

    @Test
    public void demo_mapping_at_integSubsystem_GetPerson_360() {
        //Step 1: get subsystem obj from persistence layer soap/rest/db [e.g object may be named differently in susbsystem, e.g Customer, User, People, Citizen, Vendor, Organization etc]
        //Step 2: Map fields to Person object / Case object
        //Step 3: Return t
        //var amdCase = Case.newBuilder().setId("12").setDescription("AmandaCase1").build();
        //var hansCase = Case.newBuilder().setId("34").setDescription("Water supply shutoff").build();
        //.addRecentCases(amdCase)
        var amandaXref = Xref.newBuilder().setXrefSystemId("AMANDA").setXrefId(12345).build();
        var hansenXref = Xref.newBuilder().setXrefSystemId("HANSEN").setXrefId(67890).build();

        Person pers = Person.newBuilder()
                .setFirstName("Jane")
                .setLastName("Doe")
                .setEmail("me@gmail.com")
                .putXrefs("AMANDA", amandaXref)
                .putXrefs("HANSEN", hansenXref)
                .build();
    }

    @Test
    public void test_SubsystemService_usage() {
        final var service = new SampleSubsystemServiceImpl();
        Optional<Person> perso = service.person().get(1L);
        Person savedP = service.person().create(Person.getDefaultInstance());
        List<Person> foundP = service.person().find(Person.getDefaultInstance());
        //address
        Optional<PostalAddress> addr = service.address().get(1L);
        //class
        Optional<Case> ccase = service.ccase().get(1L);
    }
}
