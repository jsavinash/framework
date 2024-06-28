package com.spring_framework.aop.dtd.before_advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Execute {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aopBeforeAdvice.xml");

        A a = context.getBean("proxy", A.class);
        a.m();
    }
}