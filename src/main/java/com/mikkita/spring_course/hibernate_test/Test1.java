package com.mikkita.spring_course.hibernate_test;

import com.mikkita.spring_course.hibernate_test.entity.Employee;
import org.hibernate.SessionFactory;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
//        try {
//            Session session = factory.getCurrentSession();
//            Employee emp = new Employee("Mikita", "Saladukha", "cyber", 2000);
//            session.beginTransaction();
//            session.save(emp);
//            session.getTransaction().commit();
//        }
//        finally {
//            factory.close();
//        }
    }
}
