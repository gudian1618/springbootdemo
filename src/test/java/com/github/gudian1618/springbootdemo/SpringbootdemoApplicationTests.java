package com.github.gudian1618.springbootdemo;

import com.github.gudian1618.springbootdemo.pojo.Dog;
import com.github.gudian1618.springbootdemo.pojo.Shiro;
import com.github.gudian1618.springbootdemo.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
// 动态加载spring容器
@SpringBootTest
class SpringbootdemoApplicationTests {

    // 测试为属性赋值
    @Autowired
    private User user;
    @Autowired
    private Dog dog;
    @Autowired
    private Shiro shiro;

    @Test
    public void testShiro() {
        shiro.pri();
    }

    @Test
    public void testUser() {
        System.out.println(user);
    }

    @Test
    public void testDog() {
        System.out.println(dog);
    }

    @Test
    void contextLoads() {
    }

}
