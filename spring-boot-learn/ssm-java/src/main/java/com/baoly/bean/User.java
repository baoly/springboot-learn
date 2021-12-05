package com.baoly.bean;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
@PropertySource(value = {"classpath:user.properties"})
public class User {
    @Value("${user.userName}")
    private String userName;
    @Value("${user.age}")
    private Integer age;
    @Value("#{new java.text.SimpleDateFormat(\"yyyy-MM-dd\").parse(\"${user.birthday}\")}")
    private Date birthday;

}
