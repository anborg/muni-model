package muni.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
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
}
