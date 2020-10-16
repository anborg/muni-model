package muni.model;

import muni.util.MockUtil;
import muni.util.ProtoUtil;
import org.junit.jupiter.api.Test;

public class TestProtoUtilSerde {

    @Test
    public void test_toJson() throws Exception{
        Model.Person p = MockUtil.buildPerson();
        ProtoUtil.toJson(p);
    }
}
