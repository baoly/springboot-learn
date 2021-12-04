package com.baoly.banner.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private Integer age;
    private String name;
    private List<String> hobbies;
    private City city;
}
