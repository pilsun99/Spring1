package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class GirlRepositoryIml implements GirlRepository{
    @Override
    public Girl getGirlByName(String name) {
        return new Girl(name);
    }
}
