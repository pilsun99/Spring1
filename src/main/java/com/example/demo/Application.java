package com.example.demo;

import com.example.demo.others.OtherGirl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages = {"com.example.demo.others", "com.example.demo.others2"})
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        try {
            Girl girl = context.getBean(Girl.class);
            System.out.println("Bean " + girl);
        } catch (Exception e) {
            System.out.println(" Bean Girl khng tồn tại");
        }

        try {
            OtherGirl otherGirl = context.getBean(OtherGirl.class);
            System.out.println("Bean " + otherGirl);
        } catch (Exception e) {
            System.out.println("Bean Girl không tồn tại");
        }
    }
}
