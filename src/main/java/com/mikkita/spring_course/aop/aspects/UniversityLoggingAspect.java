package com.mikkita.spring_course.aop.aspects;

import com.mikkita.spring_course.aop.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    /*
    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice: "+
                "логируем получение списка студентов перед" +
                " методом getStudents");
    }

    */

    /*
    @AfterReturning(pointcut = "execution(* getStudents())",
    returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(JoinPoint joinPoint,List<Student> students){
        Student firstStudent = students.get(0);
        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr. "+nameSurname;
        firstStudent.setNameSurname(nameSurname);

        double avgGrade = firstStudent.getAvgGrade();
        avgGrade = avgGrade - 1;
        firstStudent.setAvgGrade(avgGrade);



        System.out.println("afterReturningGetStudentsLoggingAdvice: "+
                "логируем получение списка студентов после" +
                " работы методоа getStudents");
    }

    */
/*
    @AfterThrowing(pointcut = "execution(* getStudents())"
    , throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем выборос " +
                "исключения "+ exception);
    }
*/

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice:" +
                " логируем нормальное окончание работы" +
                " метода или выброс исключения");
    }

}
