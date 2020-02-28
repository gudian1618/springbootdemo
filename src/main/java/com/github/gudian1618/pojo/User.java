package com.github.gudian1618.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2020/2/28 9:22 下午
 * 为对象的属性赋值,当前的对象必须交给spring容器管理
 */

@Component
public class User implements Serializable {

    private static final long serialVersionUID = 8183808202736979920L;

    /**
     * 从容器中取值之后
     */
    @Value("${user.id}")
    private Integer id;
    @Value("${user.username}")
    private String username;
    @Value("${user.age}")
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", age=" + age +
            '}';
    }
}
