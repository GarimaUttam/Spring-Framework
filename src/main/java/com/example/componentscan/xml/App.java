package com.example.componentscan.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("componentScanDemo.xml");

//        Employee employee = (Employee) context.getBean("employee");
//       or
        Employee employee = context.getBean("employee1", Employee.class);

        System.out.println(employee.toString());
    }
}