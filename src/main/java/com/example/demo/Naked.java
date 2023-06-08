package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Naked")
public class Naked implements Outfit{
    @Override
    public void wear() {
        System.out.println("Không mặc gì");
    }
}
