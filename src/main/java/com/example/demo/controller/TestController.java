package com.example.demo.controller;

import com.example.demo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.redis.core.StringRedisTemplate;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private StringRedisTemplate redisTemplate;


    @GetMapping("/testPost")
    public String testPost() {
        return userMapper.getUserList();
    }

    @GetMapping("/testRedis")
    public String testRedis() {
        return redisTemplate.opsForValue().get("test1");
    }
}
