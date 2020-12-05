package muni.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.google.protobuf.Timestamp;
import com.google.protobuf.util.Timestamps;
import muni.util.ProtoUtil;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJsonSerdeProtoUtil {
    ObjectMapper mapper = new ObjectMapper();
    @Test
    public void test_jsonToProto_Person_roundtrip_is_equal() throws Exception{
        //with
        String jsonStr = ClasspathUtil.readFileInClasspath("person.json");
        //when
        Optional<Model.Person> p = ProtoUtil.toProto(jsonStr, Model.Person.getDefaultInstance());
        System.out.println("json to Person p="+p);
        String jsonStrOut = ProtoUtil.toJson(p.get());
        assertThat(Strings.isNullOrEmpty(jsonStrOut)).isFalse();
        //then - verify
        assertEquals(mapper.readTree(jsonStr), mapper.readTree(jsonStrOut));
    }


    @Test
    public void test_emptyJson_serde_as_emptyJson()throws Exception{
        //with
        String jsonStr = ClasspathUtil.readFileInClasspath("person_null.json");
        System.out.println("jsonStr=" + jsonStr);
        //when
        Optional<Model.Person> p = ProtoUtil.toProto(jsonStr, Model.Person.getDefaultInstance());
        assertThat(p.isPresent()).isFalse();
        String jsonStrOut = ProtoUtil.toJson(null);
        System.out.println("empty p=" + p);
        //then - verify
        assertThat(Strings.isNullOrEmpty(jsonStrOut)).isTrue();
        //assertEquals(mapper.readTree(jsonStr), mapper.readTree(jsonStrOut));
    }

    @Test
    public void test_jsonToProto_Case_roundtrip_is_equal() throws Exception{
        //with
        String jsonStr = ClasspathUtil.readFileInClasspath("CaseJsonObj_deafult.json");
        Timestamp ts = Timestamps.fromMillis(System.currentTimeMillis());
        String CASETYPE_WATER_PIPE = "WATER_PIPE_TOFIX";

        var aCase = Model.Case.newBuilder()
                .setId("1")
                .setDescription("Water pipe broken, outside the house")
                .setAddress(Model.PostalAddress.newBuilder().setStreetNum("111").setStreetName("My St").setPostalCode("L1Lozo").build())
                .setTypeId(CASETYPE_WATER_PIPE)
                .putTypeProps("location","ousideresidence")
                .setStatus("INITATED") //PENDING_CUSTOMER , PENDING_ORG, PENDING_OTHER
                .setReportedByCustomer(Model.Person.newBuilder().setFirstName("Jane").setLastName("Doe"))
                //.setCreatedByEmployee(buildPerson())
                // .setCreateTime(ts).setUpdateTime(ts)
                .build();
//        jsonStr = ProtoUtil.toJson();
//        //when
//        Optional<Model.Case> c = ProtoUtil.toProto(jsonStr, Model.Case.getDefaultInstance());
//        System.out.println("json to Case ="+c);
        String jsonStrOut = ProtoUtil.toJson(aCase);

        assertThat(Strings.isNullOrEmpty(jsonStrOut)).isFalse();
        //then - verify
        assertEquals(mapper.readTree(jsonStr), mapper.readTree(jsonStrOut));
    }
}
