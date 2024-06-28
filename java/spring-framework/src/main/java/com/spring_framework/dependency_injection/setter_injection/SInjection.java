package com.spring_framework.dependency_injection.setter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class SInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("sInjectionContext.xml");
        Employee employee = (Employee) context.getBean("employee");
        employee.display();
    }
}
