package muni.model;

import muni.service.SubsystemService;

import java.util.List;
import java.util.Optional;

public class TestSubsystemDummy implements SubsystemService {

    @Override
    public SubsystemDataAccess<Model.Person> person() {return buildPersonService();}

    @Override
    public SubsystemDataAccess<Model.Case> ccase() {return buildCaseService(); }

    private SubsystemDataAccess<Model.Person> buildPersonService(){
        return new SubsystemDataAccess<Model.Person>() {
            @Override
            public Model.Person save(Model.Person in) {
                return null;
            }

            @Override
            public Optional<Model.Person> get(String id) {
                return Optional.empty();
            }

            @Override
            public List<Model.Person> find(Model.Person in) {
                return null;
            }

            @Override
            public List<Model.Person> recent() {
                return null;
            }
        };
    }
    private SubsystemDataAccess<Model.Case> buildCaseService(){
        return new SubsystemDataAccess<Model.Case>() {
            @Override
            public Model.Case save(Model.Case in) {
                return null;
            }

            @Override
            public Optional<Model.Case> get(String id) {
                return Optional.empty();
            }

            @Override
            public List<Model.Case> find(Model.Case in) {
                return null;
            }

            @Override
            public List<Model.Case> recent() {
                return null;
            }
        };
    }
}


