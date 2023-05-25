package com.sangeng;

import com.sangeng.controller.HelloController;
import com.sangeng.maper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = HelloApplcation.class)
public class ApplicationTest {

    @Autowired
    private HelloController helloController;

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testJunit(){
        System.out.println(1);
        System.out.println(helloController);
    }

    @Test
    public void tesMapper(){
        System.out.println(userMapper.findAll());
    }
}
