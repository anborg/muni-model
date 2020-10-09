package muni.model;
import muni.model.Model;
import muni.util.MockUtil;
import org.junit.jupiter.api.Test;

public class TestCreateObjects {

    @Test
    public void createPerson(){
        Model.Person pers = MockUtil.buildPerson();
        System.out.println(pers.toString());
    }
    @Test
    public void createCase(){
        Model.Case mycase = MockUtil.buildCase();
        System.out.println(mycase.toString());
    }

    @Test
    public void createAddress(){
        Model.PostalAddress address = MockUtil.buildAddress();
        System.out.println(address.toString());
    }

    @Test
    public void createOrganization(){
        Model.Organization org = MockUtil.buildOrganization();
        System.out.println(org.toString());
    }
}
