package com.spring_framework.dependency_injection.ci_dependent_object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class CiDependentObject {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ciDependentObjectContext.xml");
        Employee employee = (Employee) context.getBean("employee");
        employee.show();
    }
}