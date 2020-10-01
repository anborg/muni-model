import com.google.protobuf.Timestamp;
import muni.api.Model;
import org.junit.jupiter.api.Test;

import java.time.Instant;

public class TestCreateObjects {

    @Test
    public void createAddress(){
        Model.PostalAddress address = buildAddress();
        System.out.println(address.toString());
    }

    @Test
    public void createPerson(){
        Model.Person pers = buildPerson();
        System.out.println(pers.toString());
    }
    @Test
    public void createOrganization(){
        Model.Organization org = Model.Organization.newBuilder()
                .setName("Costco Enterprise")
                .setEmail("hello@gmail.com")
                .setPostalAddress(buildAddress())
                .setContactPerson(buildPerson())
                .build();
        System.out.println(org.toString());
    }

    public Model.Person buildPerson(){
        return  Model.Person.newBuilder()
                .setFirstName("Jane")
                .setLastName("Doe")
                .setEmail("hello@gmail.com")
                .setPostalAddress(buildAddress())
                .build();
    }

    public Model.PostalAddress buildAddress(){
        Instant now = Instant.now();
        //
        return Model.PostalAddress.newBuilder()
                .setStreetNum("111")
                .setStreetName("New Street")
                .setCity("Toronto")
                .setProvince("Ontario")
                .setCountry("Canada")
                .setPostalCode("L1L2M2")
                //
                .setId("3")
                .setCreateTime(Timestamp.newBuilder().setSeconds(now.getEpochSecond()).build())
                .setUpdateTime(Timestamp.newBuilder().setSeconds(now.getEpochSecond()).build())
                .build();
    }
}
