package muni.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import muni.util.MockUtil;
import muni.util.ProtoUtil;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProtoUtilSerde {
    ObjectMapper mapper = new ObjectMapper();
    @Test
    public void test_jsonToProto_roundtrip_is_equal() throws Exception{
        //with
        String jsonStr = ClasspathUtil.readFileInClasspath("person.json");
        //when
        Model.Person p = ProtoUtil.toProto(jsonStr, Model.Person.getDefaultInstance());
        String jsonStrOut = ProtoUtil.toJson(p);
        //then - verify
        assertEquals(mapper.readTree(jsonStr), mapper.readTree(jsonStrOut));
    }
}
