package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-factory-demo.xml");
        System.out.println("\nBeans");
        System.out.println("========================");

        for (String name : context.getBeanDefinitionNames()) {
            System.out.println(name);
        }

        Student studentOne = (Student) context.getBean("studentWOConstructor");
        Student studentTwo = (Student) context.getBean("studentWithConstructor");

        studentOne.setName("David");
        studentOne.setAge(23);

        System.out.println("============================");
        System.out.println("First student: " + studentOne.getName() + " and he is " + studentOne.getAge());
        System.out.println("Second student: " + studentTwo.getName() + " and he is " + studentTwo.getAge());
    }
}
