package com.mikkita.spring_course.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.security.spec.RSAOtherPrimeInfo;

public class CofigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person person = context.getBean("personBean",Person.class);
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        //        Cat myCat = context.getBean("cat",Cat.class);
//        myCat.say();
        context.close();
    }
}
