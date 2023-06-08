package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Bikini")

public class Bikini implements Outfit{
    @Override
    public void wear() {
        System.out.println("Mặc Bikini");
    }
}
