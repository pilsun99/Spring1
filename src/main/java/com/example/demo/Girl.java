package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Girl {
    Outfit outfit;
    public Girl(@Qualifier("Bikini") Outfit outfit){
        this.outfit = outfit;
    }
}
