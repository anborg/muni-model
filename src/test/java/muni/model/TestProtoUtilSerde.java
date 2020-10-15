package muni.model;

import muni.util.MockUtil;
import org.junit.jupiter.api.Test;

public class TestProtoUtilSerde {

    @Test
    public void test_toJson() throws Exception{
        Model.Person p = MockUtil.buildPerson();

//        Map<Descriptors.FieldDescriptor, Object> fields = p.getAllFields();
//        fields.forEach( (m,n) -> System.out.println(m.getName() + " " + n.toString()));

//        ProtoUtil.toJson();
//        System.out.println(p.toByteString());
//        p.writeDelimitedTo(System.out);
//        p.writeTo(System.out);

    }
}
