package com.spring_framework.dependency_injection.ci_with_map_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class CiWithMap2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ciWithMap2Context.xml");
        Question question = (Question) context.getBean("q");
        question.displayInfo();
    }
}