package com.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {


        System.out.println("Hello World");
    }

    public static void springWithXML(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    }
}
