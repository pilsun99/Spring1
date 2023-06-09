package com.example.demo;

import ch.qos.logback.core.testUtil.RandomUtil;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;
    public Girl getRandomGirl(){
        // Random 1 cái tên độ dài 10
        String name = randomGirlName(10);
        // Gọi xuông tầng repository để query lấy một cô gái tên là "name" trong database
        return girlRepository.getGirlByName(name);
    }

    private String randomGirlName(int lenght) {
        // Random một string có độ dài quy định
        // Sử dụng thư viện Apache Common Lang
        return RandomStringUtils.randomAlphanumeric(lenght).toLowerCase();
    }
}
