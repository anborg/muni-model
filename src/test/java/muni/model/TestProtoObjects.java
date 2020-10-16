package muni.model;

import com.google.protobuf.Timestamp;
import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.assertj.core.api.Assertions.assertThat;

public class TestProtoObjects {

    @Test
    public void objects_UNset_must_false_hasXX() {
        Model.Person pers = Model.Person.newBuilder().setFirstName("Jane").setLastName("Doe").build();
        //unset primitives
        //TODO enable after proto3-optional bug is fixed
        //assertThat(pers.hasId()).as("Unset primitive must be verifiable as empty in protobuf").isFalse();
        assertThat(pers.getId()).as("Unset primitive must be verifiable as empty in protobuf").isEmpty();//TODO Watch! Weirdity of Protobuf
        assertThat(pers.getId()).as("Unset primitive must be verifiable as empty in protobuf").isNotNull();//TODO Watch! Weirdity of Protobuf
        //unset objects
        assertThat(pers.hasAddress()).as("ProtoObj : Unset PostalAddress must result in proto.hasXX()=false").isFalse();
        assertThat(pers.hasCreateTime()).as("ProtoObj : Unset Create-Timestamp must result in proto.hasXX()=false").isFalse();
        assertThat(pers.hasUpdateTime()).as("ProtoObj : Unset Update-Timestamp must result in proto.hasXX()=false").isFalse();
    }

    @Test
    public void objects_SET_must_true_hasXX() {
        //When
        Model.Person pers = null;
        {
            Instant now = Instant.now();
            String id = "3", streetNum = "111", streetName = "New Street", city = "Toronto", province = "Ontario", country = "Canada", postalCode = "L1L2M2";
            Double lat = 22.1111, lon = 22.1111;
            var ts = Timestamp.newBuilder().setSeconds(now.getEpochSecond()).build();
            var add = Model.PostalAddress.newBuilder().setId(id).setStreetNum(streetNum).setStreetName(streetName).setCity(city).setProvince(province).setCountry(country).setPostalCode(postalCode).setCreateTime(ts).setUpdateTime(ts);
            pers = Model.Person.newBuilder().setId("1").setFirstName("Jane").setLastName("Doe").setAddress(add).setDirty(true).build();
        }//pers

        //Then
        //set primitives
        //assertThat(pers.hasId()).as("SET primitive must be verifiable as non-empty in protobuf").isTrue();
        assertThat(pers.getId()).as("SET primitive must be verifiable as non-empty in protobuf").isEqualTo("1");
        assertThat(pers.getDirty()).as("SET primitive must be verifiable as empty in protobuf").isTrue();
        //set objects
        assertThat(pers.hasCreateTime()).as("ProtoObj : Unset Create-Timestamp must result in proto.hasXX()=false").isFalse();
        assertThat(pers.hasUpdateTime()).as("ProtoObj : Unset Update-Timestamp must result in proto.hasXX()=false").isFalse();
        //set inner objects
        final var addr = pers.getAddress();
        assertThat(pers.hasAddress()).as("ProtoObj : SET PostalAddress must result in proto.hasXX()=true").isTrue();
        //assertThat(addr.hasId()).as("SET primitive must be verifiable as non-empty in protobuf").isTrue();
        assertThat(addr.getId()).as("SET primitive must be verifiable as non-empty in protobuf").isEqualTo("3");
        //TODO enable after proto3-optional bug is fixed
        //assertThat(addr.hasStreetNum()).as("SET primitive must be verifiable as non-empty in protobuf").isTrue();
        //assertThat(addr.hasStreetName()).as("SET primitive must be verifiable as non-empty in protobuf").isTrue();
        //assertThat(addr.hasPostalCode()).as("SET primitive must be verifiable as non-empty in protobuf").isTrue();
        //
        assertThat(addr.getStreetNum()).as("SET primitive must be verifiable as non-empty in protobuf").isNotEmpty();
        assertThat(addr.getStreetName()).as("SET primitive must be verifiable as non-empty in protobuf").isNotEmpty();
        assertThat(addr.getPostalCode()).as("SET primitive must be verifiable as non-empty in protobuf").isNotEmpty();
        //
        assertThat(addr.hasCreateTime()).as("ProtoObj : Unset Create-Timestamp must result in proto.hasXX()=false").isTrue();
        assertThat(addr.hasUpdateTime()).as("ProtoObj : Unset Update-Timestamp must result in proto.hasXX()=false").isTrue();
    }


//    @Test
//    public void createCase(){
//        Model.Case mycase = MockUtil.buildCase();
//        //System.out.println(mycase.toString());
//    }
//
//    @Test
//    public void createAddress(){
//        Model.PostalAddress address = MockUtil.buildAddress();
//        //System.out.println(address.toString());
//    }
//
//    @Test
//    public void createOrganization(){
//        Model.Organization org = MockUtil.buildOrganization();
//        //System.out.println(org.toString());
//    }
}
