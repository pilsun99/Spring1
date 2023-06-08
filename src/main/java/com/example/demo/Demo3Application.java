package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo3Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Demo3Application.class, args);
        // Khi chạy xong, lúc này context sẽ chứa các Bean có đánh
        // dấu @Component.
        Girl girl = context.getBean(Girl.class);
        System.out.println("Girl Intance : " + girl);
        System.out.println("Girl Outfit: " + girl.outfit);
        girl.outfit.wear();


    }

}
