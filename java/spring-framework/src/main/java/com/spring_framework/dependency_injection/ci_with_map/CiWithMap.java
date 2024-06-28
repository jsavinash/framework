package com.spring_framework.dependency_injection.ci_with_map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class CiWithMap {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ciWithMapContext.xml");
        Question question = (Question) context.getBean("q");
        question.displayInfo();
    }
}