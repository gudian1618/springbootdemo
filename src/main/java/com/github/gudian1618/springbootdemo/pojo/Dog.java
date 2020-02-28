package com.github.gudian1618.springbootdemo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2020/2/28 10:05 下午
 */

@Component
// 导入配置文件信息
@PropertySource(value = "classpath:/properties/dog.properties")
public class Dog {

    @Value("${dog.id}")
    private Integer id;
    @Value("${dog.name}")
    private String name;

    @Override
    public String toString() {
        return "Dog{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }
}
