package corp.model;

import muni.service.SubsystemService;

import java.util.List;
import java.util.Optional;
// This Dummy is just to see structure of a SSS
public class SampleSubsystemServiceImpl implements SubsystemService {

    @Override
    public SubsystemDataAccess<Person> person() {
        return buildPersonService();
    }

    @Override
    public SubsystemDataAccess<PostalAddress> address() {
        return buildAddressService();
    }

    @Override
    public SubsystemDataAccess<Case> ccase() {
        return buildCaseService();
    }

    private SubsystemDataAccess<Person> buildPersonService() {
        return new SubsystemDataAccess<Person>() {
            @Override
            public Person create(Person in) {
                return null;
            }

            @Override
            public Person update(Person in) {
                return null;
            }

            @Override
            public Optional<Person> get(Long id) {
                return Optional.empty();
            }

            @Override
            public List<Person> find(Person in) {
                return null;
            }

            @Override
            public List<Person> recent() {
                return null;
            }
        };
    }

    private SubsystemDataAccess<Case> buildCaseService(){
        return new SubsystemDataAccess<Case>() {
            @Override
            public Case create(Case in) {
                return null;
            }

            @Override
            public Case update(Case in) {
                return null;
            }

            @Override
            public Optional<Case> get(Long id) {
                return Optional.empty();
            }

            @Override
            public List<Case> find(Case in) {
                return null;
            }

            @Override
            public List<Case> recent() {
                return null;
            }
        };
    }//buildcaseService
    private SubsystemDataAccess<PostalAddress> buildAddressService(){
        return new SubsystemDataAccess<PostalAddress>() {

            @Override
            public PostalAddress create(PostalAddress in) {
                return null;
            }

            @Override
            public PostalAddress update(PostalAddress in) {
                return null;
            }

            @Override
            public Optional<PostalAddress> get(Long id) {
                return Optional.empty();
            }

            @Override
            public List<PostalAddress> find(PostalAddress in) {
                return null;
            }

            @Override
            public List<PostalAddress> recent() {
                return null;
            }
        };
    }
}


