package io.github.lwlee2608.proto.example.helloworld;

import io.github.lwlee2608.proto.annotation.ProtoField;
import io.github.lwlee2608.proto.annotation.ProtoMessage;

@ProtoMessage(protoName = "helloworld", protoPackage = "example.helloworld")
public class HelloReply {
    @ProtoField(tag = 1)
    private String name;
}
