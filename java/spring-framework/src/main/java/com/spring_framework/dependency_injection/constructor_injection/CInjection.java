package com.spring_framework.dependency_injection.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class CInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("cInjectionContext.xml");
        Employee employee = (Employee) context.getBean("employee");
        employee.show();
    }
}
