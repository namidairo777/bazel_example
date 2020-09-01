package com.xiao;

import com.xiao.generator.Generator;

public class HelloWorld {
    public static void main(String[] args) {
        final Generator g = new Generator();
        System.out.println(g.getMessage());
        System.out.println(g.getMessageList());
    }
}
