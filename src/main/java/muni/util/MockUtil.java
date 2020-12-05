package muni.util;

import com.google.protobuf.Timestamp;
import com.google.protobuf.util.Timestamps;
import muni.model.Model;
import muni.model.MuniService;

import java.time.Instant;
import java.util.Optional;

public class MockUtil {
    public static Model.Person buildPerson() {
        return buildPerson("99", "Jane", "Doe");
    }

    /**
     * Use this to mock creation of XREF Person (in a syb-ssystem)
     *
     * @param in Person
     * @param subsysId {AMANDA|...}
     * @return Person
     */
    public static Model.Person buildXrefPerson(Model.Person in, String subsysId) {
        Model.Person.Builder builder = Model.Person.newBuilder();
        //ignore id from main person, but make a rand
        String id = subsysId + (int) (Math.random() * 1000); //Rand amanda ID
        builder.setId(id)
                .setFirstName(in.getFirstName())
                .setLastName(in.getLastName())
                .setAddress(in.getAddress())
                .setEmail(in.getEmail())
                .setPhone1(in.getPhone1())
                .setPhone2(in.getPhone2());
        return builder.build();
    }

    public static Model.Case buildCase() {
        Timestamp ts = Timestamps.fromMillis(System.currentTimeMillis());
        return Model.Case.newBuilder()
                .setId("1")
                .setStatus("INITATED") //PENDING_CUSTOMER , PENDING_ORG, PENDING_OTHER
                .setReportedByCustomer(buildPerson())
                .setAddress(buildAddress())
                .setCreatedByEmployee("rose")
                .setCreateTime(ts).setUpdateTime(ts)
                .build();
    }

    public static Model.Organization buildOrganization() {
        return Model.Organization.newBuilder()
                .setName("Costco Enterprise")
                .setAddress(buildAddress())
                .build();
    }


    public static Model.Person buildPerson(String id, String firstName, String lastname ) {

        Timestamp ts = Timestamps.fromMillis(System.currentTimeMillis());
        var pb = Model.Person.newBuilder();
        Optional.ofNullable(id).ifPresent(pb::setId);
        Optional.ofNullable(firstName).ifPresent(pb::setFirstName);
        Optional.ofNullable(lastname).ifPresent(pb::setLastName);
        Optional.ofNullable("me@gmail.com").ifPresent(pb::setEmail);
        Optional.ofNullable("123445678").ifPresent(pb::setPhone1);
        Optional.ofNullable("123445678").ifPresent(pb::setPhone2);
        Optional.ofNullable(buildAddress()).ifPresent(pb::setAddress);
        Optional.ofNullable(ts).ifPresent(pb::setCreateTime);
        Optional.ofNullable(ts).ifPresent(pb::setUpdateTime);
        var amandaXref = Model.Xref.newBuilder().setId(id).setXrefSystemId("AMANDA").build();
        pb.putXrefs(amandaXref.getXrefSystemId(), amandaXref);
        return pb.build();
    }


//    public static Model.ContactChannels buildContactChannels(){
//        return Model.ContactChannels.newBuilder()
//                .setEmail("me@gmail.com")
//                .setPhone1(Model.Phone.newBuilder().setCountryCode(1).setNumber("123445678").setExt("xs234").build())
//                .setPhone2(Model.Phone.newBuilder().setCountryCode(1).setNumber("123445678").setExt("xs234").build())
//                .setPostalAddress(buildAddress())
//                .build();
//    }

//    public static Model.Phone buildPhone(){
//        return Model.Phone.newBuilder().setCountryCode(1).setNumber("123445678").setExt("xs234").build();
//    }

    public static Model.PostalAddress buildAddress() {
//        Timestamp ts = Timestamps.fromMillis(System.currentTimeMillis());
        Instant now = Instant.now();
        String streetNum = "111", streetName = "New Street", city = "Toronto", province = "Ontario", country = "Canada", postalCode = "L1L2M2", id = "3";
        Double lat = 22.1111, lon = 22.1111;
        var ts = Timestamp.newBuilder().setSeconds(now.getEpochSecond()).build();
        var ab = Model.PostalAddress.newBuilder();
        Optional.ofNullable(id).ifPresent(ab::setId);
        Optional.ofNullable(streetNum).ifPresent(ab::setStreetNum);
        Optional.ofNullable(streetName).ifPresent(ab::setStreetName);
        Optional.ofNullable(city).ifPresent(ab::setCity);
        Optional.ofNullable(country).ifPresent(ab::setCountry);
        Optional.ofNullable(province).ifPresent(ab::setProvince);
        Optional.ofNullable(postalCode).ifPresent(ab::setPostalCode);
        Optional.ofNullable(lat).ifPresent(ab::setLat);
        Optional.ofNullable(lon).ifPresent(ab::setLon);
        Optional.ofNullable(ts).ifPresent(ab::setCreateTime);
        Optional.ofNullable(ts).ifPresent(ab::setUpdateTime);


        return ab.build();
    }

    public static MuniService.SearchReqPerson buildSearchReqPerson(){
        return buildSearchReqPerson(buildPerson());
    }

    public static MuniService.SearchReqPerson buildSearchReqPerson(Model.Person person){
        return MuniService.SearchReqPerson.newBuilder().setPerson(person).build();
    }

    public MuniService.SearchRes buildSearchRes_personList(){
        return MuniService.SearchRes.newBuilder().setPersonList(MuniService.PersonList.newBuilder().addPersons(buildPerson())).build();
    }
    public MuniService.SearchRes buildSearchRes_addressList(){
        return MuniService.SearchRes.newBuilder().setPostalAddressList(MuniService.PostalAddressList.newBuilder().addAddresses(buildAddress())).build();
    }
}
