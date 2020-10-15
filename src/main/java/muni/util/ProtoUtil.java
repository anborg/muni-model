package muni.util;

import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.util.JsonFormat;

public class ProtoUtil {
    public static <T extends Message> String toJson(T obj){
        try{
            return JsonFormat.printer().print(obj);
        }catch(Exception e){
            throw new RuntimeException("Error converting Proto to json", e);
        }
    }
    public static <T extends MessageOrBuilder> T toProto(String protoJsonStr, T message){
        try{
            Message.Builder builder = message.getDefaultInstanceForType().toBuilder();
            JsonFormat.parser().ignoringUnknownFields().merge(protoJsonStr,builder);
            T out = (T) builder.build();
            return out;
        }catch(Exception e){
            throw new RuntimeException("Error converting json to Proto", e);
        }
    }
}