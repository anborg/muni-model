import com.google.protobuf.Timestamp;
import muni.model.Model;
import muni.util.MockUtil;
import org.junit.jupiter.api.Test;

import java.time.Instant;

public class TestCreateObjects {

    @Test
    public void createAddress(){
        Model.PostalAddress address = MockUtil.buildAddress();
        System.out.println(address.toString());
    }

    @Test
    public void createPerson(){
        Model.Person pers = MockUtil.buildPerson();
        System.out.println(pers.toString());
    }
    @Test
    public void createOrganization(){
        Model.Organization org = MockUtil.buildOrganization();
        System.out.println(org.toString());
    }


}
