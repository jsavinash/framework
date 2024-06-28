package com.spring_framework.dependency_injection.ci_with_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class CiWithCollection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ciWithCollectionContext.xml");
        Question question = (Question) context.getBean("question");
        question.displayInfo();
    }
}