package com.spring_framework.aop.aspectj_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Execute {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aspectjAnnotation.xml");

        Operation e = (Operation) context.getBean("opBean");
        System.out.println("calling msg...");
        e.msg();
        System.out.println("calling m...");
        e.m();
        System.out.println("calling k...");
        e.k();
    }
}