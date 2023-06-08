package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo3Application {

    public static void main(String[] args) {
        // ApplicationContext chính là container, chứa toàn bộ các Bean
        System.out.println(" > Trước khi Ioc Container được khởi tạo ");
        ApplicationContext context = SpringApplication.run(Demo3Application.class, args);
        System.out.println("Sau khi Ioc Container được khởi tạo");
        // Khi chạy xong, lúc này context sẽ chứa các Bean có đánh
        // dấu @Component.
        Girl girl = context.getBean(Girl.class);
        System.out.println(" > Truớc khi Ioc Container destroy Girl");
        ((ConfigurableApplicationContext) context).getBeanFactory().destroyBean(girl);
        System.out.println(" > Sau khi Ioc Container destroy Girl");




    }

}
