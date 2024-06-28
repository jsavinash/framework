package com.spring_framework.dependency_injection.ci_with_collection_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class CiWithCollection2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ciWithCollection2Context.xml");
        Question question = (Question) context.getBean("question");
        question.displayInfo();
    }
}