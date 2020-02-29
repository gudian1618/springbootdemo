package com.github.gudian1618.springbootdemo.config;

import com.github.gudian1618.springbootdemo.pojo.Shiro;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2020/2/29 8:48 下午
 * 该类中标识就是xml中数据 <bean id="方法名" class="返回值类型"/>
 */

@Configuration
public class ShiroConfig {

    // public 返回值类型 方法名称(参数列表)
    @Bean
    public Shiro shiro() {
        return new Shiro();
    }

}
