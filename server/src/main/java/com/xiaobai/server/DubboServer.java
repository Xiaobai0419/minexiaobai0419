package com.xiaobai.server;



import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DubboServer {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        context.start();
        System.in.read();//任意键退出
    }
}
