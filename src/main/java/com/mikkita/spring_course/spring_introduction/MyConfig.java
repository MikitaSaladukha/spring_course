package com.mikkita.spring_course.spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
//@ComponentScan("com.mikkita.spring_course.spring_introduction")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    @Scope("prototype")
    public Person personBean(){
        return new Person(catBean());
    }
}
