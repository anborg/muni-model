package muni.util;
import com.google.common.base.Strings;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.util.JsonFormat;

import java.util.Objects;
import java.util.Optional;

/**
 * Author @espresso stackoverflow.
 * Sample use:
 * Model.Person reqObj = ProtoUtil.toProto(reqJson, Model.Person.getDefaultInstance());
 * Model.Person res = personSvc.update(reqObj);
 * final String resJson = ProtoUtil.toJson(res);
 **/
public class ProtoUtil {

    public static <T extends Message> Optional<String> toJson(T obj) {
        if(isNullable(obj)) return Optional.empty();
        try {
            return Optional.of(JsonFormat.printer().print(obj));
        } catch (Exception e) {
            throw new RuntimeException("Error converting Proto to json", e);
        }
    }//toJson

    public static <T extends MessageOrBuilder> Optional<T> toProto(String protoJsonStr, T message) {
        //TODO perhaps for null, I have to return defaultInstance() ?
        if(isNullable(protoJsonStr)) return Optional.empty();
        try {
            Message.Builder builder = message.getDefaultInstanceForType().toBuilder();
            JsonFormat.parser().ignoringUnknownFields().merge(protoJsonStr, builder);
            T out = (T) builder.build();
            return Optional.of(out);
        } catch (Exception e) {
            throw new RuntimeException("Error converting json to Proto", e);
        }
    }//toProto
    static final String EMPTY_JSON = "{}";

    public static boolean isNullable(Message message){
        return (Objects.isNull(message) || Strings.isNullOrEmpty(message.toString()));
    }
    public static boolean isNullable(String jsonStr){
        return (Strings.isNullOrEmpty(jsonStr) || jsonStr.contentEquals(EMPTY_JSON));
    }
}