package com.xiao.generator;

import java.util.List;

import com.google.common.collect.ImmutableList;

public class Generator {
    public String getMessage() {
        return "Hello world";
    }

    public List<String> getMessageList() {
        return ImmutableList.of("message1", "message2");
    }
}
