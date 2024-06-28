package com.spring_framework.create_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class CreateBean {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("createBean.xml");
        Student student = (Student) context.getBean("student");
        student.displayInfo();
    }
}
