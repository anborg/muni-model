package muni.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import muni.util.MockUtil;
import muni.util.ProtoUtil;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProtoUtilSerde {
    ObjectMapper mapper = new ObjectMapper();
    @Test
    public void test_jsonToProto_roundtrip_is_equal() throws Exception{
        //with
        String jsonStr = ClasspathUtil.readFileInClasspath("person.json");
        //when
        Optional<Model.Person> p = ProtoUtil.toProto(jsonStr, Model.Person.getDefaultInstance());
        Optional<String> jsonStrOut = ProtoUtil.toJson(p.get());
        assertThat(jsonStrOut.isPresent()).isTrue();
        //then - verify
        assertEquals(mapper.readTree(jsonStr), mapper.readTree(jsonStrOut.get()));
    }
    @Test
    public void test_emptyJson_serde_as_emptyJson()throws Exception{
        //with
        String jsonStr = ClasspathUtil.readFileInClasspath("person_null.json");
        System.out.println("jsonStr=" + jsonStr);
        //when
        Optional<Model.Person> p = ProtoUtil.toProto(jsonStr, Model.Person.getDefaultInstance());
        assertThat(p.isPresent()).isFalse();
        Optional<String> jsonStrOut = ProtoUtil.toJson(null);
        System.out.println("empty p=" + p);
        //then - verify
        assertThat(jsonStrOut.isPresent()).isFalse();
        //assertEquals(mapper.readTree(jsonStr), mapper.readTree(jsonStrOut));
    }
}
