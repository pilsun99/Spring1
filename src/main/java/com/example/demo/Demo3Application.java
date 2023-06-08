package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo3Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Demo3Application.class, args);
        Outfit outfit = context.getBean(Outfit.class);
        System.out.println("Intance" + outfit);
        outfit.wear();
        Girl girl = context.getBean(Girl.class);
        System.out.println("Girl Intance : " + girl);
        System.out.println("Girl Outfit: " + girl.outfit);
        girl.outfit.wear();


    }

}
