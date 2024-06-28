package com.spring_framework.dependency_injection.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Cinjection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("cInjectionContext.xml");
        Employee employee = (Employee) context.getBean("employee");
        employee.show();
    }
}
